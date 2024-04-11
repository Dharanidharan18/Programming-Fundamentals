package com.chainsys.day3;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number of Service Years : " );
		int year = sc.nextInt();
		System.out.print("Enter your Salary amount : ");
		double salary = sc.nextInt();
		
		if(year>5) {
			System.out.println("You have got 5% bonus on your salary ");
			double newSalary = salary*0.05;
			newSalary = salary+newSalary;
			System.out.println("Your new salary is : " + newSalary);
		}
		else {
			System.out.println("you will have 5% bonus if you have more than 5 years of experience ");
		}
		
		

	}

}
