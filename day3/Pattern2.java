package com.chainsys.day3;

public class Pattern2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i=4;i>=1;i--) {
            for(int space=i;space<4;space++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                if(j%2==0) {
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }

}