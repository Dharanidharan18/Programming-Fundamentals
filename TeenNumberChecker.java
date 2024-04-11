package com.chainsys.day5;

import java.util.Scanner;

public class TeenNumberChecker {
	
	
	
	public static boolean hasTeen (int num1,int num2,int num3) {
			return isTeen(num1) || isTeen(num2) || isTeen(num3);
	}
	
	public static boolean isTeen (int num) {
		return num >= 13 && num <= 19;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("press '1',To check teen in three integers");
		System.out.println("press '2'.To check teen in a Single integer");
		while(true) {
			char c = sc.next().charAt(0);
			
			if(c=='1') {
				
				System.out.println("Enter the first numbers : ");
				int num1 = sc.nextInt();
				System.out.println("Enter the second numbers : ");
				int num2 = sc.nextInt();
				System.out.println("Enter the third numbers : ");
				int num3 = sc.nextInt();
				
				System.out.println( " Atleast one number is spelled as teen : " +hasTeen(num1, num2, num3) );
				
				break;
			}
			
			else {
				System.out.println("Enter a number : ");
				int num = sc.nextInt();
				
				System.out.println(isTeen(num));
				break;
			}
			  
		}
		
	

	}

}
