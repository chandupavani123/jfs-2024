package com.vz.day4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income:");
        double income = sc.nextDouble();
        double tax;
        if (income<=300000)
        {
         tax=income*0.05;
        } else if (income>300000&&income<=500000) {
           tax=income*0.10;
        } else {
            tax=income*0.30;
        }
        System.out.println("Tax amount is:"+tax);
        }
    }
