package com.bridgelabz;

import java.util.Scanner;
import java.util.Random;

public class FlipCoin_PrintPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of times you want to flip the coin");
        int num=sc.nextInt();

        int head = 0;
        int tail = 0;
        for(int i=0;i<num;i++) {
            double coin = Math.random();


            if (coin < 0.5) {
                head++;
            } else {
                tail++;
            }
        }
            int headPercentage=head*100/num;
            int tailPercentage = tail*100/num;

            System.out.println("The head-percentage is" + headPercentage);
            System.out.println("The tail-percentage is" + tailPercentage);

    }
}
