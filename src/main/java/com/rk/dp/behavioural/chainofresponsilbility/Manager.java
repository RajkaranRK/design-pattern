package com.rk.dp.behavioural.chainofresponsilbility;


public class Manager extends Employee {

    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        Type type = application.getType();
        boolean isApproved = application.getDays()<=5 && (type == Type.SICK || type == Type.GL);
        if(isApproved) {
            application.setApprovedBy(getRole());
            application.setStatus(Status.APPROVED);
        }
        return isApproved;
    }
}
