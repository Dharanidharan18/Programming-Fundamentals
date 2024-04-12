package com.chainsys.day3;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Scanner scanner =new Scanner(System.in);

		                System.out.print("Enter your gross salary: ");
		                double grossSalary = scanner.nextDouble();

		                System.out.print("Enter your total savings: ");
		                double totalSavings = scanner.nextDouble();

		                double taxableIncome = grossSalary - Math.min(totalSavings, 100000);

		                double tax = calculateTax(taxableIncome);

		                System.out.println("Your tax amount is: Rs. " + tax);
		            }

		            public static double calculateTax(double taxableIncome) {
		                double tax = 0;

		                if (taxableIncome <= 100000) {
		                   
		                    tax = 0;
		                } else if (taxableIncome <= 200000) {
		                   
		                    tax = 0.10 * (taxableIncome - 100000);
		                } else if (taxableIncome <= 500000) {
		                   
		                    tax = calculateTax(200000) + 0.20 * (taxableIncome - 200000);
		                } else {
		                    
		                    tax = calculateTax(500000) + 0.30 * (taxableIncome - 500000);
		                }

		                return tax;
		            }     

	}


