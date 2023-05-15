package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.domain.ResultTransfer;
import ar.com.java.test.transacction.domain.TransferDTO;
import ar.com.java.test.transacction.domain.TransferMessage;
import reactor.core.publisher.Mono;

public interface ITransferClient {

    public void sendTransfer(TransferMessage transfer);

}
