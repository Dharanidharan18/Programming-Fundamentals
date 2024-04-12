package com.chainsys.day3;
import java.util.Scanner;

public class AverageAndProduct {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int sum=0;
	        int count =0;
	        int product=1;
	        System.out.println("Enter numbers press q to stop");
	        
	        while(true) {
	            String stopValue =sc.next();
	            if(stopValue.equalsIgnoreCase("q")) {
	                break;
	            }
	            try {
	                int num = Integer.parseInt(stopValue);
	                sum +=num;
	                product *=num;
	                count++;
	            }
	            catch(Exception e) {
	                System.out.println("Invalid number ");
	            }
	        }
	        if (count>0) {
	            double average =(double)sum/count;
	            System.out.println("average :"+average);
	            System.out.println("product :"+product);
	        }
	        
	    }

	}
