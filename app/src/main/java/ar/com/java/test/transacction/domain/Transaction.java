package ar.com.java.test.transacction.domain;

import java.util.UUID;

public class Transaction {

    private final UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }
}
