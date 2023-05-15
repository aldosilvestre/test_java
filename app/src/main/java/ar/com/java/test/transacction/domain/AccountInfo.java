package ar.com.java.test.transacction.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getCbu() {
    return cbu;
  }

  public void setCbu(String cbu) {
    this.cbu = cbu;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
