package com.chainsys.leaveManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        
        scanner.nextLine(); 
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        
        EmployeeDetails.Employee employee = new EmployeeDetails().new Employee();
        employee.setId(employeeId);
        employee.setName(employeeName);

        
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDateString = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateString);

        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDateString = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateString);

        
        LeaveManagementSystem.RequestLeaveFunction requestLeaveFunction = new LeaveManagementSystem().new RequestLeaveFunction();
        LeaveManagementSystem.ApproveLeaveFunction approveLeaveFunction = new LeaveManagementSystem().new ApproveLeaveFunction();

        
        requestLeaveFunction.requestLeave(employee, startDate, endDate);

        
        System.out.println("Employee details: " + employee);
        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);

        
//        System.out.print("Approve leave? (yes/no): ");
//        String decision = scanner.nextLine();
//        if (decision.equalsIgnoreCase("yes")) {
//            approveLeaveFunction.approveLeave(employee.getLeave());
//        } else {
//            approveLeaveFunction.rejectLeave(employee.getLeave());
//        }

        scanner.close();
    }
}
