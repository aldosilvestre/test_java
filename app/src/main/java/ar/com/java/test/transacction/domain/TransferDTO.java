package ar.com.java.test.transacction.domain;

public class TransferDTO extends Transaction {

    private Account source;
    private Account destiny;
    private Float amount;
    private String concept;

    public TransferDTO(Transfer transfer) {
        this.amount = transfer.getAmount();
        this.concept = transfer.getConcept();
        this.source = transfer.getSource();
        this.destiny = transfer.getDestiny();
    }

    public static TransferDTO from(Transfer transfer){
        return new TransferDTO(transfer);
    }

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public Account getDestiny() {
        return destiny;
    }

    public void setDestiny(Account destiny) {
        this.destiny = destiny;
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
