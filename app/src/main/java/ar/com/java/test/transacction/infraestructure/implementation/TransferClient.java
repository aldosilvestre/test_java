package ar.com.java.test.transacction.infraestructure.implementation;

import ar.com.java.test.transacction.domain.ResultTransfer;
import ar.com.java.test.transacction.domain.TransferDTO;
import ar.com.java.test.transacction.infraestructure.ITransferClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TransferClient implements ITransferClient {

    private Logger logger = LoggerFactory.getLogger(TransferClient.class);

    @Autowired
    private WebClient webClient;

    /** <p>Se opto de hacerlo por esta manera debido a que la propia api de transferencias es la que tendria que hacer
     *  el control de si la cuenta es de la moneda a la cual se transfiere.</p>
     * <p>Si no ocurriera esto, y es por parte de nosotros la validacion del cbu, sera descomponer el valor en
     * sus partes y generar un nuevo objeto con los valores correspondientes, y en caso de ser invalidos devolver
     * dicho mensaje o excepcion al front o servicio que invoco.</p>
     *
     * @param transfer : {@link TransferDTO}
     * @return {@link ResultTransfer}
     */
    @Override
    public ResultTransfer sendTransfer(TransferDTO transfer) {
        logger.info(String.format(">>>> sendTransaction with id %s <<<<", transfer.getUuid()));
        return webClient
                .post()
                .uri("https://6v0qr.wiremockapi.cloud/test/transferpost")
                .body(BodyInserters.fromValue(transfer))
                .retrieve()
                .bodyToMono(ResultTransfer.class)
                .block();
    }

}
