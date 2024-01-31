package com.vz.day2;

import java.math.MathContext;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 33;
        int num3 = 45;
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Biggest of three numbers is:" + max);

        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-10));
        System.out.println(Math.PI);

    }
}
