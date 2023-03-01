package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter a positive integer N: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a positive integer! Please try again.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);


        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("The " + n + "th harmonic number is: " + harmonic);
    }
}
