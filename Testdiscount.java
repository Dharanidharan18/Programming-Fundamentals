package com.chainsys.day6;

import java.util.Scanner;

public class Testdiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       
	        Scanner sc = new Scanner(System.in);
	        Cab cabDiscount = new Cab();    
	        double amount=cabDiscount.cabFare();
	        System.out.println("the amount "+amount);
	        DiscountCalculator.cab(amount);
	                

	    }

	}

