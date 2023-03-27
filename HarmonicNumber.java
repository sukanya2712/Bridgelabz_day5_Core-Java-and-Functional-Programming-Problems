package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
       


        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("The " + n + "th harmonic number is: " + harmonic);
    }
}
