package ar.com.java.test.transacction.application;

import ar.com.java.test.transacction.domain.AccountInfo;
import ar.com.java.test.transacction.infraestructure.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import reactor.core.publisher.Mono;

@Service
public class AccountService {

  @Autowired
  private IAccountRepository accountRepository;

  public Mono<AccountInfo> getAccountInfo(String cbuOrAlias) {
    return accountRepository
        .getInfo(cbuOrAlias);
  }

  public void discountValue(AccountInfo account, Float value) {
    accountRepository
        .discountBalance(account.getCbu(), value);
  }

}
