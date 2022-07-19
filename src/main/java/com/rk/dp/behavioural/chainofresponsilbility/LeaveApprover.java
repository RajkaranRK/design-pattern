package com.rk.dp.behavioural.chainofresponsilbility;

public interface LeaveApprover {
    
    public void processLeaveApplication(LeaveApplication application);
    
    public String getRole();
    
}
