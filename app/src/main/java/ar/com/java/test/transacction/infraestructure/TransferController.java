package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.application.TransferService;
import ar.com.java.test.transacction.domain.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TransferController {

    @Autowired
    private TransferService transactionService;

    @PostMapping("transfer")
    public Mono<String> transfer(Transfer transfer){
        return transactionService.doTransfer(transfer);
    }

}
