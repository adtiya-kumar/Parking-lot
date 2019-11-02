package com.justpark.models.electronics;

import com.justpark.models.DBObject;

public class Electronics extends DBObject {
    private String invoice;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
}
