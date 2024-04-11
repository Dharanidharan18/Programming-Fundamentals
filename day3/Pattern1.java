package com.chainsys.day3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of Rows : ");	
		int row = 0;
		
		try { 
			
			 row = sc.nextInt();
		
		}
		catch(InputMismatchException e) {
	
			System.out.println("Invalid input! Please enter an integer value for the number of rows.");
            sc.nextLine(); 
            System.out.print("Enter the number of Rows : ");
            row = sc.nextInt();
		}
		
		for(int i=1;i<= row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
