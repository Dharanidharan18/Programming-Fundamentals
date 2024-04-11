package com.chainsys.day6;

import java.util.Scanner;

public class ECommerceDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double totalBill = scanner.nextDouble();

        double finalBill = applyDiscount(totalBill);

        if (finalBill != -1) {
            System.out.println("Total bill after discount: Rs. " + finalBill);
        }
    }

    public static double applyDiscount(double totalBill) {
        Scanner scanner = new Scanner(System.in);

        double discount = 0;

        
        if (totalBill > 2000 && totalBill <= 5000) {
            discount = totalBill * 0.02;
        } else if (totalBill > 5000) {
            discount = totalBill * 0.05; 
        }

       
        System.out.print("Enter coupon code (or leave blank if none): ");
        String couponCode = scanner.nextLine().trim();

        if (!couponCode.isEmpty()) {
            switch (couponCode) {
                case "COUP_2":
                    discount += totalBill * 0.02; 
                    break;
                case "COUP_5":
                    discount += totalBill * 0.05; 
                    break;
                default:
                    System.out.println("Invalid coupon code. No additional discount applied.");
            }
        }

        double finalBill = totalBill - discount;
        return finalBill;
    }
}



























