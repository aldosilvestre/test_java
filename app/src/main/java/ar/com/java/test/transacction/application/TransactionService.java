package ar.com.java.test.transacction.application;

import ar.com.java.test.transacction.domain.Transfer;
import ar.com.java.test.transacction.domain.TransferDTO;
import ar.com.java.test.transacction.infraestructure.ITransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private ITransferClient client;

    public String doTransaction(Transfer transfer){
        var result = client.sendTransfer(TransferDTO.from(transfer));
        return String.format("transferencia realizada con codigo %s y fecha %s ", result.getOperationCode(), result.getCreatedDate().toString());
    }

}
