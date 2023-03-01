package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();

//        do {
//            System.out.print("Enter Power of N: ");
//            while (!scanner.hasNextInt()) {
//                System.out.println(" Please try again.");
//                scanner.next();=
//            }
//            num = scanner.nextInt();
//        } while (num < 32);



        if(num < 32) {
            for (int i = 0; i <= num; i++) {
                int powerOf2 = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + powerOf2);
            }
        }else{
            System.out.println("");
        }

    }
}
