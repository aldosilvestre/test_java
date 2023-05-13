package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.application.TransactionService;
import ar.com.java.test.transacction.domain.Account;
import ar.com.java.test.transacction.domain.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("transfer")
    public String doTransfer(Transfer transfer){
        return transactionService.doTransaction(transfer);
    }

    @GetMapping("transfer")
    public String getTransfer() {
        var transaction = new Transfer();
        transaction.setAmount(1000f);
        transaction.setConcept("Varios");
        transaction.setSource(new Account(null, "1234567890123456789055" ));
        transaction.setDestiny(new Account("alias.prueba", null ));

        return transactionService.doTransaction(transaction);
    }

}
