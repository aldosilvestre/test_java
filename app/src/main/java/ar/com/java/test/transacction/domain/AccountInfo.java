package ar.com.java.test.transacction.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountInfo {

  @JsonProperty("name")
  private String name;
  @JsonProperty("lastName")
  private String lastName;
  @JsonProperty("bank")
  private String bank;
  @JsonProperty("cbu")
  private String cbu;
  @JsonProperty("alias")
  private String alias;
  @JsonProperty("currency")
  private String currency;

}
