package ar.com.java.test.transacction.infraestructure;

import ar.com.java.test.transacction.application.AccountService;
import ar.com.java.test.transacction.domain.AccountInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AccountController {

  private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
  @Autowired
  private AccountService accountService;

  /** <p>Se obtiene para que el usuario pueda visualizar los valores de la cuenta</p>
   * @param cbuOrAlias String
   * @return {@link AccountInfo}
   */
  @GetMapping(value = "account", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<AccountInfo> getAccount(@RequestParam("search") String cbuOrAlias){
    logger.info(String.format("<<< Get info from cbu or alias : %s >>>", cbuOrAlias));
    return accountService.getAccountInfo(cbuOrAlias);
  }
}
