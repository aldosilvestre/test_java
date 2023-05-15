package ar.com.java.test.transacction.infraestructure.implementation;

import ar.com.java.test.transacction.domain.AccountInfo;
import ar.com.java.test.transacction.infraestructure.IAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

@Service
public class AccountRepository implements IAccountRepository {

  private static final Logger logger = LoggerFactory.getLogger(AccountInfo.class);

  @Value("${account.service.uri}")
  private String urlServiceAccount;

  @Autowired
  private WebClient webClient;

  @Override
  public Mono<AccountInfo> getInfo(String cbuOrAlias) {
    return webClient
        .get()
        .uri(
            UriComponentsBuilder.fromUriString(urlServiceAccount + "/getInfo").queryParam("search", cbuOrAlias).build().toUri()
        )
        .retrieve()
        .bodyToMono(AccountInfo.class);
  }

  @Override
  public void discountBalance(String cbu, Float amount) {
    webClient
        .post()
        .uri(
            UriComponentsBuilder.fromUriString(urlServiceAccount + "/transfer")
                .queryParam("cbu", cbu)
                .queryParam("amount", amount)
                .build()
                .toUri()
        )
        .retrieve();
  }
}
