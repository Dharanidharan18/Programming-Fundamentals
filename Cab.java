package com.chainsys.day6;
import java.util.*;

public class Cab {


	    public static double cabFare() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Taxi booking !");
	        System.out.println("");
	        System.out.println("Choose cab type !\n 1) Micro ( Rs.10 per km )\n 2) Mini ( Rs.15 per km )\n 3) Prime ( Rs.20 per km )");
	        System.out.println("");
	        
	        double km ;
	        System.out.println("Enter number of km :");
	        km = sc.nextDouble();
	        
	        
	        System.out.println("Enter you cab type : ");
	        char option = sc.next().charAt(0);
	        double amount = 0;
	        switch(option) {
	        case'1':
	            amount = km*10;
	            break;
	        case'2':
	            amount = km*15;
	            break;
	        case'3':
	            amount = km*20;
	            break;
	        default:
	            System.out.println("Invalid taxi type ! ");
	            break;
	        }
	        System.out.println("Your fare amount :"+amount);
	        return amount;
	        
	    }

	}