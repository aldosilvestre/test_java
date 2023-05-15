package ar.com.java.test.transacction.application;

import ar.com.java.test.transacction.domain.exceptions.CustomException;
import ar.com.java.test.transacction.domain.Transfer;
import ar.com.java.test.transacction.domain.TransferMessage;
import ar.com.java.test.transacction.infraestructure.ITransferClient;
import ar.com.java.test.transacction.infraestructure.ITransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TransferService {

    @Autowired
    private ITransferClient client;
    @Autowired
    private AccountService accountService;

    @Autowired
    private ITransferRepository transferRepository;

    public Mono<String> doTransfer(Transfer transfer) {
        // obtener cuentas
        var accountSource = accountService.getAccountInfo(transfer.getSource().getCbu()).block();
        var accountDestiny = accountService.getAccountInfo(transfer.getDestiny().getCbu()).block();

        // Verificar si la cuenta de origen y destino tienen la misma moneda
        if (!accountSource.getCurrency().equals(accountDestiny.getCurrency())) {
          throw new CustomException("La moneda de las cuentas no son iguales");
        }

        // Descuento el monto de la cuenta origen
        accountService.discountValue(accountSource, transfer.getAmount());

        // Envio un mensaje con el monto a la cuenta a acreditar
        var tranferToSend = new TransferMessage(accountSource.getCbu(), accountDestiny.getCbu(), transfer.getAmount(), transfer.getConcept());
        client.sendTransfer(tranferToSend);

        // Registro la transferencia en estado 'pendiente'
        transferRepository.saveTransfer(tranferToSend);

        // Devuelvo el numero de orden que genere en la BD de transferencia pendiente
        return null;
    }

}
