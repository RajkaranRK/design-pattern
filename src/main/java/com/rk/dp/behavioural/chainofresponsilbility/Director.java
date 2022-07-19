package com.rk.dp.behavioural.chainofresponsilbility;

public class Director extends Employee {

    public Director( LeaveApprover successor) {
        super("Director", successor);
        
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        boolean isApproved =  application.getDays()<=15;
        if(isApproved) {
            application.setApprovedBy(getRole());
            application.setStatus(Status.APPROVED);
        }
        return isApproved;
    }
    
    
}
