package com.vz.day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DiscountCalculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double billamount = sc.nextDouble();
        double discountamount = getdiscountdetails(billamount);
        System.out.println("Discount amount is:" + discountamount);
    }

    public static double getdiscountdetails(double value) {
        if (value > 0 && value >= 1000) {
            return value * 0.05;
        }
        return 0.0;
    }
}
