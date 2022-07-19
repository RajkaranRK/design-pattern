package com.rk.dp.behavioural.chainofresponsilbility;


public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        boolean isApproved =  application.getDays()<=2 && application.getType() == Type.SICK;
        if(isApproved) {
            application.setApprovedBy(getRole());
            application.setStatus(Status.APPROVED);
        }
        return isApproved;
    }

}
