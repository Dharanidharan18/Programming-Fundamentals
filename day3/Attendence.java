package com.chainsys.day3;
import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of Classes held : ");
		float classesHeld = sc.nextFloat();
		System.out.println("Total No of Classes held in this Semester is : " +classesHeld);
		System.out.println("Enter the no of Classes you have Attended : ");
		float classesAttened = sc.nextFloat();
		
		float percentage = (classesAttened/classesHeld)*100;
		
		System.out.println("Total persentage of classes you have attended : " + percentage+"%");

		if(percentage>75) {
			System.out.println("You are allowed to atten the exam ");
		}
		else {
			System.out.println("You are not allowed to atten the exam ");
		}
		
		System.out.println("Enter if you have any medical causes : ");
		char med = sc.next().charAt(0);
		if(med=='y' || med=='Y') {
			System.out.println("You are allowed to atten the exam ");
		}
		
		else if (med=='n' || med=='N') {
			System.out.println("You are not allowed to atten the exam ");
		}
		else {
			System.out.println("Enter the correct input 'Y' or 'N' ");
			med =sc.next().charAt(0);
			if(med=='y' || med=='Y') {
				System.out.println("You are allowed to atten the exam ");
			}
			
			else if (med=='n' || med=='N') {
				System.out.println("You are not allowed to atten the exam ");
			}
			
			
		}
	}

}
