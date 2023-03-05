package com.bridgelabz;

public class Factors {
    public static void main(String[] args) {
      int n = 56;
        System.out.print("Prime factors of " + n + ": ");
        computePrimeFactors(n);
    }
    
    public static void computePrimeFactors(int n) {
        // Traverse till i*i <= n for efficiency
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is still greater than 1, it must be a prime factor
        if (n > 1) {
            System.out.print(n);
        }
    }
}
