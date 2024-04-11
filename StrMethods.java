package com.chainsys.day5;
import java.util.Arrays; 
public class StrMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		System.out.println(s.toUpperCase()); 
		System.out.println(s.toLowerCase()); 
		
		String a = "  Virat kholi  ";
		System.out.println(a.trim());
		
		String b = "Dhoni";
		System.out.println(b.startsWith("Dh")); 
		System.out.println(b.endsWith("n"));
		
		String c = "Rohit";
		System.out.println(c.charAt(0)); 
		System.out.println(c.charAt(3));
		
		String d = "AB deviliers";
		System.out.println(d.length());
		
		String s0="java string";
		s0=s0.concat(" is immutable");
		System.out.println(s0);
		
		String e = "abcd".substring(1);
        System.out.println(e);
        
		 e = "abcd".substring(2,4);
         System.out.println(e);
         
         String str = "Hello";
         int codePoint = str.codePointAt(1); 
         System.out.println(codePoint);
         
         String s1="Java";
         String s2="python";
         String s3="Javascript";
         String s4="python";
         System.out.println(s1.equals(s3));
         System.out.println(s3.equals(s4));
         System.out.println(s2.equals(s4));
         
         String str1 = "helloworld";
         String str2 = "helloworld";
         int res = str1.compareTo(str2);
         System.out.println(res);
         
         int[] numbers = {1, 2, 3, 4, 5};
         String result = Arrays.toString(numbers);
         System.out.println(result);

         
         System.out.println(str1.codePointBefore(7));
         System.out.println(str.codePointCount(3, 5));
         System.out.println(str1.codePointCount(3,4));
         System.out.println(str1.compareTo(str));
         
         String text = "apple,banana,grape,orange";
         String[] fruits = text.split(",");
         for (String fruit : fruits) {
             System.out.println(fruit);
         }

	}
}
