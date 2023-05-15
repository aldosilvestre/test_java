package ar.com.java.test.transacction.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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
}
