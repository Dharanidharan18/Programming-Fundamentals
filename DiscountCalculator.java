package com.chainsys.day6;
import java.util.Scanner;

public class DiscountCalculator { 
	

	    public static double cab(double amount) {
	        Scanner sc = new Scanner(System.in);
	        
	        // TODO Auto-generated method stub
	        if(amount > 2000 && amount < 5000) {
	            System.out.println("You have discount of 2% !");
	            System.out.println("Do you wanna apply your coupon ? ");
	            char ansTwo = sc.next().charAt(0);
	            if( ansTwo == 'Y' || ansTwo == 'y' ) 
	            
	            {
	                
	                System.out.println("Enter your coupon code : ");
	                String coupcode =sc.next().toUpperCase().trim();
	                if(coupcode.equalsIgnoreCase("COUP_2"))
	                
	                {
	                    double twoAmount = amount*0.02;
	                    double finalAmount = amount - twoAmount;
	                    System.out.println("Your price before applying coupon "+amount);
	                    System.out.println("Your price after applying coupon : "+finalAmount);
	                }
	                }
	            else if(ansTwo == 'N' || ansTwo == 'n') {
	                System.out.println("Your price is : "+amount);
	            }
                
	                
	            }
	        else if(amount >= 5000)
	        {
	            
	            double finalAmount = 0;
	            System.out.println("You have discount of 5% !");
	            System.out.println("Do you wanna apply your coupon ? ");
	            char ansFive = sc.next().charAt(0);
	            if( ansFive == 'Y' || ansFive == 'y' ) 
	            {
	                System.out.println("Enter your coupon code : ");
	                String coupcode1 = sc.next().toUpperCase().trim();
	                if(coupcode1.equalsIgnoreCase("COUP_5"))
	                
	                {
	                    double fiveAmount = amount*0.02;
	                     finalAmount = amount - fiveAmount;
	                    System.out.println("Your price before applying coupon "+amount);
	                    System.out.println("Your price after applying coupon : "+finalAmount);
	                
	                }
	        }
	            else if(ansFive == 'N' || ansFive == 'n') {
	                System.out.println("Your price is : "+amount);
	            }
	            
	            
	            else
	            {
	                System.out.println(amount);
	            }
	    }
	        return amount;
	    }
	}
