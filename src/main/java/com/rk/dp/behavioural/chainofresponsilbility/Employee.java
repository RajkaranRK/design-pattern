package com.rk.dp.behavioural.chainofresponsilbility;

import java.util.Objects;

public abstract class Employee implements LeaveApprover{
    
    private String role;
    
    private LeaveApprover successor;
    
    protected Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }
    
    

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if(!processRequest(application) && Objects.nonNull(successor)) {
            successor.processLeaveApplication(application);
        }
        if(successor == null && application.getStatus() == Status.PENDING) {
            application.setStatus(Status.REJECTED);
        }
    }

    @Override
    public String getRole() {
       return role;
    }
    
    protected abstract boolean processRequest(LeaveApplication application);

}
