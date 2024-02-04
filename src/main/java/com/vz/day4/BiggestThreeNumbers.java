package com.vz.day4;

public class BiggestThreeNumbers {
    public static void main(String[] args) {
        int a = 150;
        int b = 20;
        int c = 30;
        //int biggestNobig = 0;
        int biggestNo=BiggestNo(a,b,c);
        System.out.println("The biggest number is:" + biggestNo);
        int biggestNo2=BiggestNo(10,20,500);
        System.out.println("The biggest number second time is:" + biggestNo2);

    }
    public static int BiggestNo(int a, int b, int c){
        if (a > b && a > c) {
           return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
