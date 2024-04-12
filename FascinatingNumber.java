package com.chainsys.day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FascinatingNumber {

	 public static int countOfNumber(int num) {
	        int count=0;
	        while(num>0) {
	            num=num/10;
	            count++;
	        }
	        num=1;
	        for(int i=0;i<count;i++) {
	            num=num*10;
	        }
	        return num;
	    }
	    public static boolean validate(String input) {
	        // Define a regular expression to match each digit from 1 to 9
	        Pattern pattern = Pattern.compile("[1-9]");
	        Matcher matcher = pattern.matcher(input);

	        // HashSet to keep track of encountered digits
	        HashSet<Character> set = new HashSet<>();

	        // Iterate over matches and check uniqueness
	        while (matcher.find()) {
	            char digit = matcher.group().charAt(0);
	            if (set.contains(digit)) {
	                // Digit already encountered, not unique
	                return false;
	            } else {
	                set.add(digit);
	            }
	        }
	        // All digits from 1 to 9 are unique
	        return set.size() == 9;
	    }
	    public static void logic(int num1) {
	        int num2=num1*countOfNumber(num1)+num1*2;
	        int num3=num2*countOfNumber(num1)+num1*3;
	        String num=Integer.toString(num3);
	        System.out.println(num3);
	        
	        if(validate(num)) {
	            System.out.println("Fascinating Number");
	        }
	        else {
	            System.out.println("Not Fascinatng Number");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Number");
	        int num=sc.nextInt();
	        logic(num);
	    }
	}

