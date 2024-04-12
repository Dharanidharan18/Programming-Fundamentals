package com.chainsys.day3;
import java.util.Scanner;



public class Climate {

	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("is rainining outside ?");
	        System.out.println("Enter True or False");
	        boolean isRaining = sc.nextBoolean();
	        if (isRaining) {
	            System.out.println("Please take an umberella");
	            System.out.println("Please enter the temperature");
	            int temp = sc.nextInt();
	            if (temp>0) {
	            if (temp<32) {
	                System.out.println("advice to heavy jacket");
	                
	            }
	            else if (temp>32 || temp <50) {
	                System.out.println("advice to  take light jacket");
	                
	            }
	            else {
	                System.out.println("No need jacket");
	            }
	        }else {
	            System.out.println("please valid temperature");
	        }
	        
	        }
	        else {
	            System.out.println("no rain");
	        }
	    }

	}

