package com.chainsys.day6;

import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the km: ");
        double km = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Cab Type: ");
        String cabType = sc.nextLine().trim();

        double fare = calculateFare(km, cabType);

        if (fare != -1) {
            System.out.println("Cab fare: Rs." + fare);
        }
    }

    public static double calculateFare(double km, String cabType) {
    	
    	Scanner sc = new Scanner(System.in);
        double farePerKm = 0;
        switch (cabType.toLowerCase()) {
            case "micro":
                farePerKm = 10;
                break;
            case "mini":
                farePerKm = 15;
                break;
            case "prime":
                farePerKm = 20;
                break;
            default:
                System.out.println("Invalid cab type. Please choose Micro, Mini, or Prime.");
                
//                System.out.print("Please Re Enter Cab Type: ");
//                cabType = sc.nextLine().trim();
                return -1;
        }

        if (km <= 0) {
            System.out.println("Distance must be greater than zero.");
            
//            System.out.println("Please Re Enter the km");
//            km = sc.nextDouble();
            sc.nextLine();
            return -1;
        }

        return km * farePerKm;
    }
}
