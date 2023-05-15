package ar.com.java.test.transacction.infraestructure.implementation;

import ar.com.java.test.transacction.domain.TransferMessage;
import ar.com.java.test.transacction.infraestructure.ITransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferRepository implements ITransferRepository {

  @Override
  public void saveTransfer(TransferMessage tranfer) {

    //TODO
    System.out.println("...");
  }
}
