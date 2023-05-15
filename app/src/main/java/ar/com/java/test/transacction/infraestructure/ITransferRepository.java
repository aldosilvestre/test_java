package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.domain.TransferMessage;

public interface ITransferRepository {

    public void saveTransfer(TransferMessage tranferToSend);

}
