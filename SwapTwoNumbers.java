package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Before swapping, the numbers are:");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping, the numbers are:");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
    }
}
