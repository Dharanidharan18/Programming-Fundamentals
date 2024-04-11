package com.chainsys.day3;
import java.util.Scanner;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		        Scanner scanner = new Scanner(System.in);

		    
		        System.out.print("Enter Gender (M or F): ");
		        char gender = scanner.next().charAt(0);
		        if (gender != 'M' && gender != 'F') {
		            System.out.println("Invalid Gender status! Please enter M or F.");
		            System.out.print("Enter Gender (M or F): ");
		            gender = scanner.next().charAt(0);
		           
		        }
		        
		        
		        System.out.print("Enter age: ");
		        int age = scanner.nextInt();
	        
		            if (age < 0 || age > 60) { 
		            
		                System.out.println("Invalid age! Age must be between 0 and 60.Please Re Enter your age.");
		                System.out.print("Enter age: ");
				        age = scanner.nextInt();
		                
		            }
		         	     
		       System.out.print("Enter marital status (Y or N): ");
		       char maritalStatus = scanner.next().charAt(0);
		        if (maritalStatus != 'Y' && maritalStatus != 'N') {
		            System.out.println("Invalid marital status! Please enter Y or N.");
		            System.out.print("Enter marital status (Y or N): ");
		            maritalStatus = scanner.next().charAt(0);
		           
		        }

		    
		        String placeOfService;
		        if (gender == 'F') {
		            placeOfService = "Urban areas";
		        } else if (gender == 'M') {
		            if (age >= 20 && age <= 40) {
		                placeOfService = "Anywhere";
		            } else if (age > 40 && age <= 60) {
		                placeOfService = "Urban areas";
		            } else {
		                placeOfService = "ERROR";
		            }
		        } else {
		            placeOfService = "ERROR";
		        }

	
		        System.out.println("Place of service: " + placeOfService);

		        scanner.close();
		    }
		}


