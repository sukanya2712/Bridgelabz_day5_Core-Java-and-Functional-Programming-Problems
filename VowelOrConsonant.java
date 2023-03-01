package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = sc.next();

        if (alphabet.length() > 1) {
            System.out.println("Error: Please enter a single alphabet.");
        } else {
            switch(alphabet.toLowerCase()) {
                case "a":
                    System.out.println("The alphabet is a vowel.");
                    break;
                case "e":
                    System.out.println("The alphabet is a vowel.");
                    break;
                case "i":
                    System.out.println("The alphabet is a vowel.");
                    break;
                case "o":
                    System.out.println("The alphabet is a vowel.");
                    break;
                case "u":
                    System.out.println("The alphabet is a vowel.");
                    break;
                default:
                    System.out.println("The alphabet is a consonant.");
                    break;
            }
        }
    }
}
