package ar.com.java.test.transacction.domain;

import java.time.LocalDateTime;

public class ResultTransfer {

    private String operationCode;
    private LocalDateTime createdDate;

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
