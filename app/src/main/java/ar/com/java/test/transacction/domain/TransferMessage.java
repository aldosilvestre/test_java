package ar.com.java.test.transacction.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class TransferMessage extends Transaction{

  private String cbuSource;
  private String cbuDestiny;
  private Float amount;
  private String concept;

}
