package com.vz.day3;

import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price:");
        double cp = sc.nextDouble();
        System.out.println("Enter selling price:");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("profit:" + profit);

        } else if (sp < cp) {
            double loss = cp - sp;
            System.out.println("loss:" + loss);
        } else {
            System.out.println("no profit or loss");
        }

    }
}
