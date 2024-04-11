package com.chainsys.day3;
import java.util.Scanner;

public class OddEvenCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter the value of n: ");
		        int n = scanner.nextInt();

		        System.out.println("Odd numbers up to " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            if (i % 2 != 0) { 
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();

		        System.out.println("Even numbers up to " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            if (i % 2 == 0) { 
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();

		        System.out.println("Cube of numbers up to " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            int cube = i * i * i; 
		            System.out.println("Cube of " + i + " = " + cube);
		        }

		        scanner.close();
		    }
		}
