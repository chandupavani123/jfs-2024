package com.vz.day4;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double billamount = sc.nextDouble();
        System.out.println("Enter the day:");
        String day = sc.next();
        double discount_amount;
        if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("saturday")){
            discount_amount = billamount * 0.10;
        } else {
            discount_amount = billamount * 0.30;
        }
        System.out.println("Total_billamount is:" + (billamount - discount_amount));
    }
}
