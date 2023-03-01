package com.bridgelabz;

import java.util.Scanner;
public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor;

        System.out.print("Enter the dividend: ");
        dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
