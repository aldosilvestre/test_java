package ar.com.java.test.transacction.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    private String alias;
    private String cbu;

    public Account(String alias, String cbu) {
        this.alias = alias;
        this.cbu = cbu;
    }

}
