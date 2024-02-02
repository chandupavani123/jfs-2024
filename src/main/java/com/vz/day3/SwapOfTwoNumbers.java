package com.vz.day3;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int sum = n1;
        System.out.println("before swap n1 value :" + n1 + " n2 value" + n2);
        n1 = n2;
        n2 = sum;
        System.out.println("after swap n1 value :" + n1 + " n2 value" + n2);
    }
}
