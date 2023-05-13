package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.domain.ResultTransfer;
import ar.com.java.test.transacction.domain.TransferDTO;

public interface ITransferClient {

    ResultTransfer sendTransfer(TransferDTO transfer);


}
