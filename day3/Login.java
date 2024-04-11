package com.chainsys.day3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
	
	
      public static boolean isUserPassword(String password) {
    	   //String regex = "^[a-zA-Z](?=.*\\d)";
    	 String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()-_=+]).{8}$";

    	  Pattern p = Pattern.compile(regex);
    	    Matcher m = p.matcher(password);
    	   
    	    return m.matches();
      }
      
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> userName = new ArrayList<>();
		ArrayList<String> Password = new ArrayList<>();
		
//		System.out.println("Enter Login data (type 'done' to finish):");
		
		while(true) {
			
			System.out.print("Create a new UserName : ");
			String username  = sc.nextLine();
			 
			System.out.print("Create a new Password : ");
			String password = sc.nextLine();
			
			//System.out.println(isUserPassword(password));
			if(!isUserPassword(password)) {
				System.out.println("invalid Password  ");
				System.out.println("Please use one Capital letter,A numeric value and A Special charcter ");
				System.out.println("Please Re Enter your Password  ");
				password = sc.nextLine();
				
				
			}
			
			userName.add(username);
			Password.add(password);
			
			System.out.println("You are Succesfully Signed up.And you are all set to login now!!");
			System.out.println("=================================================================");
			break;
		}
		
		System.out.print("Enter your UserName : ");
		String enteredUsername  = sc.nextLine();
//		userName.add(username);
		 	
		System.out.print("Eneter Password : ");
		String enteredPassword = sc.nextLine();
//		Password.add(password);

		boolean loggedIn = false;
		
		for(int i=0;i<userName.size();i++) {
			if(userName.get(i).equals(enteredUsername)&&Password.get(i).equals(enteredPassword)) {
				loggedIn = true;
				break;
			}
		}
		
		if (loggedIn) {
            System.out.println("Login successful! Welcome, " + enteredUsername + "!");
        } 
		else {
            System.out.println("Invalid username or password. Please try again.");
            
            System.out.print("Enter your UserName : ");
            enteredUsername  = sc.nextLine();
//    		
    		 	
    		System.out.print("Eneter Password : ");
    		enteredPassword = sc.nextLine();  		
            
    		loggedIn = false;
    		
    		for(int i=0;i<userName.size();i++) {
    			if(userName.get(i).equals(enteredUsername)&&Password.get(i).equals(enteredPassword)) {
    				loggedIn = true;
    				break;
    			}
    		}
    		
    		if (loggedIn) {
                System.out.println("Login successful! Welcome, " + enteredUsername + "!");
            } 
    		else {
                System.out.println("Invalid username or password. Please try again.");
    		}
        }
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
//		while (true) {
//            String input = sc.nextLine();
//
//            // Check if the user wants to finish
//            if (input.equalsIgnoreCase("done")) {
//                break;
//            }
//
//            // Add the input to the ArrayList
//            //.add(input);
//        }

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		if(UserCheck(username)) {
//			
//			System.out.println("Enter the Password : ");
//			String password = sc.nextLine();
//			
//			Password.add(password);
//			
//			if(PasswordCheck(password)) {
//				
//				System.out.println("login Succesfull!");
//			}
//			else {
//				System.out.println("Invalid Password ");
//			}
//		}
//		else {
//			
//			System.out.println("Invalid User name");
//		}
//	}		
//		public static boolean UserCheck(String user) {
//			
//			if(userName) {
//				
//			}
////			Pattern p = Pattern.compile("DharAni");
////	        Matcher m = p.matcher(user);
////	        return m.find();
//	        
//		}		
//		public static boolean PasswordCheck(String password) {
//			
//			Pattern p = Pattern.compile("Iphone6s.");
//	        Matcher m = p.matcher(password);
//	        return m.find();
	}

}
