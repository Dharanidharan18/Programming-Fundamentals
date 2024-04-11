package com.chainsys.day3;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the shop ");
		System.out.println("Enter the amount of quantity : ");
		int quantity = sc.nextInt();
		
		double UnitCost = 100;
		double Totalcost = UnitCost*quantity;
		
		
		if(Totalcost>1000) {
			System.out.println("You have got 10% discount! on this purchase");
			double discount = 0.10*Totalcost;
			discount = Totalcost-discount;
			System.out.println("Your final amount to pay is : " + discount);
		}
		else {
			System.out.println("Your final amount to pay is : " + Totalcost);
		}

	}

}
