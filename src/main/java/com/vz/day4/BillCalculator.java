package com.vz.day4;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double billamount = sc.nextDouble();
        System.out.println("enter prime member or not: ");
        String customertype = sc.next();
        billamount = billAmount(billamount, customertype);
        System.out.println("Total bill amount:"+billamount);
    }


    public static double billAmount(double billamount, String CT) {
        double discount = 0.0;
        if (billamount > 1000) {
            discount = billamount * 0.10;
            billamount = billamount - discount;
        } else if (CT.equalsIgnoreCase("Prime")) {
            discount = billamount * 0.15;
            billamount = billamount - discount;
        }
        System.out.println("Discount is:"+discount);
        return billamount;
    }
}