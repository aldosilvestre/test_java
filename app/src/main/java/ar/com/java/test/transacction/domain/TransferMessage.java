package ar.com.java.test.transacction.domain;

public class TransferMessage extends Transaction{

  private String cbuSource;
  private String cbuDestiny;
  private Float amount;
  private String concept;

  public TransferMessage(String cbuSource, String cbuDestiny, Float amount, String concept) {
    this.cbuSource = cbuSource;
    this.cbuDestiny = cbuDestiny;
    this.amount = amount;
    this.concept = concept;
  }

  public String getCbuSource() {
    return cbuSource;
  }

  public void setCbuSource(String cbuSource) {
    this.cbuSource = cbuSource;
  }

  public String getCbuDestiny() {
    return cbuDestiny;
  }

  public void setCbuDestiny(String cbuDestiny) {
    this.cbuDestiny = cbuDestiny;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }
}
