package com.chainsys.leaveManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeaveManagementSystem {
    public class RequestLeaveFunction {
        private List<EmployeeDetails.Leave> leaveDatabase = new ArrayList<>();
        private int leaveIdCounter = 1;

        public boolean requestLeave(EmployeeDetails.Employee employee, LocalDate startDate, LocalDate endDate) {
            if (startDate.isAfter(endDate) || startDate.isEqual(endDate)) {
                System.out.println("Error: End date must be after start date.");
                return false;
            }

            EmployeeDetails.Leave leave = new EmployeeDetails().new Leave();
            leave.setId(leaveIdCounter++);
            leave.setEmployee(employee);
            leave.setStartDate(startDate);
            leave.setEndDate(endDate);
            leave.setStatus(EmployeeDetails.LeaveStatus.APPROVED); // Default to APPROVED

            leaveDatabase.add(leave);
            System.out.println("Leave request submitted successfully.");
            return true;
        }
    }

    public class ApproveLeaveFunction {
        public boolean approveLeave(EmployeeDetails.Leave leave) {
            leave.setStatus(EmployeeDetails.LeaveStatus.APPROVED);
            System.out.println("Leave status updated to APPROVED.");
            return true;
        }

        public boolean rejectLeave(EmployeeDetails.Leave leave) {
            leave.setStatus(EmployeeDetails.LeaveStatus.REJECTED);
            System.out.println("Leave status updated to REJECTED.");
            return true;
        }
    }
}
