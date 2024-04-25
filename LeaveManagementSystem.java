package com.chainsys.leaveManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeaveManagementSystem {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
       Leave leave = new Leave();
       
   System.out.println();
   System.out.println("Please enter any one option :");
   System.out.println();    
       
        while (true) {
            System.out.println("1. Add Employee and Set Password");
            System.out.println("2. Check Leave Eligibility and Grant Leave");
            System.out.println("3. Display Generl Holidays");
            System.out.println("4. Exit");
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
                    System.out.println("Generl Holidays\n");
                    
                    GeneralHolidays.printGeneralHolidays();
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class GeneralHolidays{
	   
	    public static void printGeneralHolidays() {
	    	System.out.println("Dec 25, Wednesday - Christmas");
	    	
	    	 System.out.println("Jan 1 ,Monday New Years Day\r\n"
	 		   		+ "Jan 15 ,Monday Pongal\r\n"
	 		   		+ "Jan 16 ,Tuesday Thiruvalluvar Day\r\n"
	 		   		+ "Jan 17 ,Wednesday Uzhavar Thirunal\r\n"
	 		   		+ "Jan 25 ,Thursday Thai Poosam\r\n"
	 		   		+ "Jan 26 ,Friday Republic Day\r\n"
	 		   		+ "Mar 29 ,Friday Good Friday\r\n"
	 		   		+ "Apr 1 ,Monday Annual closing of Accounts for Commercial Banks and Co-operative Banks\r\n"
	 		   		+ "Apr 9 ,Tuesday Telugu New Year Day\r\n"
	 		   		+ "Apr 11 ,Thursday Ramzan (Idul Fitr)\r\n"
	 		   		+ "Apr 14 ,Sunday Tamil New Years Day and Dr.B.R.Ambedkars Birthday\r\n"
	 		   		+ "Apr 21 ,Sunday Mahaveer Jayanthi\r\n"
	 		   		+ "May 1 ,Wednesday May Day\r\n"
	 		   		+ "Jun 17 ,Monday Bakrid(Idul Azha)\r\n"
	 		   		+ "Jul 17 ,Wednesday Muharram\r\n"
	 		   		+ "Aug 15 ,Thursday Independence Day\r\n"
	 		   		+ "Aug 26 ,Monday Krishna Jayanthi\r\n"
	 		   		+ "Sep 7 ,Saturday Vinayakar Chathurthi\r\n"
	 		   		+ "Sep 16 ,Monday Milad-un-Nabi\r\n"
	 		   		+ "Oct 2 ,Wednesday Gandhi Jayanthi\r\n"
	 		   		+ "Oct 11 ,Friday Ayutha Pooja\r\n"
	 		   		+ "Oct 12 ,Saturday Vijaya Dasami\r\n"
	 		   		+ "Oct 31 ,Thursday Deepavali\r\n"
	 		   		+ "Dec 25 ,Wednesday Christmas\n"); 
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

class Leave {
   
    public boolean canGrantLeave(Employee employee, String leaveType, int duration) {
        
        return true; 
    }

    
    public void grantLeave(int empId, String leaveType, int duration) {
        
        System.out.println("Leave granted successfully for Employee ID: " + empId);
    }
}


