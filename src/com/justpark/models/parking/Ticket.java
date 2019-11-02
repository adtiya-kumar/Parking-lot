package com.justpark.models.parking;

import java.time.LocalDateTime;

public class Ticket {
    private TicketStatus status;
    private LocalDateTime issued;

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public LocalDateTime getIssued() {
        return issued;
    }

    public void setIssued(LocalDateTime issued) {
        this.issued = issued;
    }
}
