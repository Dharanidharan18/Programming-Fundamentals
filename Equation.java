package com.chainsys.day3;

public class Equation {
	
	
	    public static void main(String[] args) {
	        for (int y = 5; y <= 10; y++) {
	            int result = solveEquation(y);
	            System.out.println("For y = " + y + ", equation result = " + result);
	        }
	    }

	    public static int solveEquation(int y) {
	        return 2 * y * y + y + 5;
	    }
	}


