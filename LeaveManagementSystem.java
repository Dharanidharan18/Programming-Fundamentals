package com.chainsys.leaveManagement;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LeaveManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
       Leave leave = new Leave();
//        ArrayList<String> LeaveType=new ArrayList<>();
//
//        LeaveType.add("SICKLEAVE");
//        LeaveType.add("CASUALLEAVE");
//        LeaveType.add("PERMISSION");

        
        while (true) {
            System.out.println("1. Add Employee and Set Password");
            System.out.println("2. Check Leave Eligibility and Grant Leave");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    //System.out.print("Enter total leaves: ");
                    //int totalLeaves = scanner.nextInt();
                    System.out.print("Enter password: ");
                    String password = scanner.next();
                    admin.addEmployeeWithPassword(name, password);
                    break;
                    
                case 2:
                    System.out.print("Enter employee ID: ");
                    int empId = scanner.nextInt();
                    System.out.print("Enter leave type (SICK LEAVE, CASUAL LEAVE, PERMISSION): ");
                    String leaveType = scanner.next().toUpperCase();
                    
                    if( leaveType.equals("PERMISSION")) {
                    	System.out.print("Enter duration (in hours): ");
                        int duration = scanner.nextInt();
                        if(duration <0  ) {
                        	System.out.println("invalid duration timing");
                        }
                        else if (duration>2) {
                        	System.out.println("your permission timing exceeds more than 2 hours please re enter the timing ");
                        	System.out.print("Enter duration (in hours): ");
                             duration = scanner.nextInt();
                             leave.grantLeave(empId, leaveType, duration);
                        }
                    }
                    else {
                    	System.out.print("Enter duration of leave (in days): ");
                        int duration = scanner.nextInt();
                        leave.grantLeave(empId, leaveType, duration);
                       
                    }
                    break;
                   
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


class Employee {
    private int id;
    private String name;
    private String password;
    private int totalLeaves;
    private int leavesTaken;

    public Employee(int id, String name, String password, int totalLeaves) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.totalLeaves = totalLeaves;
        this.leavesTaken = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalLeaves() {
        return totalLeaves;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
}


class Admin {
	
	 
	    private static final int DEFAULT_TOTAL_LEAVES = 20; 
	    private static int nextId = 1;
	    private Map<Integer, Employee> employeeMap = new HashMap<>();

	    
	    public void addEmployeeWithPassword(String name, String password) {
	        Employee employee = new Employee(nextId, name, password, DEFAULT_TOTAL_LEAVES);
	        employeeMap.put(nextId++, employee);
	        System.out.println("Employee added successfully. Employee ID: " + employee.getId());
	    }

	    // Method to set password for employee
	    public void setPassword(int empId, String password) {
	        Employee employee = employeeMap.get(empId);
	        if (employee != null) {
	            employee.setPassword(password);
	            System.out.println("Password set successfully for Employee ID: " + empId);
	        } else {
	            System.out.println("Employee not found.");
	        }
	    }
	    
	}



//enum LeaveType {
//    SICKLEAVE,
//    CASUALLEAVE,
//    PERMISSION
//}

class Leave {
   
    public boolean canGrantLeave(Employee employee, String leaveType, int duration) {
        
        return true; 
    }

    
    public void grantLeave(int empId, String leaveType, int duration) {
        
        System.out.println("Leave granted successfully for Employee ID: " + empId);
    }
}
