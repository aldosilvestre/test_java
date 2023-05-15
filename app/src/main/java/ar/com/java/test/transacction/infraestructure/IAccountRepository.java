package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.domain.AccountInfo;
import reactor.core.publisher.Mono;

public interface IAccountRepository {

  public Mono<AccountInfo> getInfo(String cbuOrAlias);

  void discountBalance(String cbu, Float amount);

}
