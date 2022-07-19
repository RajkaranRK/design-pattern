package com.rk.dp.behavioural.chainofresponsilbility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class LeaveApplication {
    
    
    private LocalDate from;
    
    private LocalDate to;
    
    private Status status;
    
    private Type type;
    
    private String approvedBy;
    
    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
        this.type = type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public Status getStatus() {
        return status;
    }

    public Type getType() {
        return type;
    }

    public String getApprovedBy() {
        return approvedBy;
    }
    
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LeaveApplication [from=" + from + ", to=" + to + ", status=" + status + ", type=" + type + ", approvedBy=" + approvedBy
                + "]";
    }
    
    public int getDays() {
        return (int) ChronoUnit.DAYS.between(from, to);
    }
    
}
