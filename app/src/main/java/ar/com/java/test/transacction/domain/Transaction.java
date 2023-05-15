package ar.com.java.test.transacction.domain;

import java.io.Serializable;
import java.util.UUID;

public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }
}
