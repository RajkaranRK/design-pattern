package com.rk.dp.behavioural.chainofresponsilbility;

import java.time.LocalDate;

public class Client {
    
    
    public static void main(String []args) {
        LeaveApprover approver = getApproverChain();
        
        LeaveApplication application = new LeaveApplication(Type.SICK, LocalDate.of(2022, 7, 7), LocalDate.of(2022, 7, 24));
        System.out.println("Before approving "+ application);
        approver.processLeaveApplication(application);
        System.out.println("After Approval "+application);
    }
    
    
    private static LeaveApprover getApproverChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }

}
