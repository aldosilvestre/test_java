package ar.com.java.test.transacction.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    private String alias;
    private String cbu;

    public Account(String alias, String cbu) {
        this.alias = alias;
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
}
