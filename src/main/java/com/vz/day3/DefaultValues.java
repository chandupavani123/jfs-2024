package com.vz.day3;

public class DefaultValues {
    byte b;
    short s;
    int i;
    float f;
    long l;
    double d;
    boolean flag;
    char ch;
    String name;


    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Byte value is :" + obj.b);
        System.out.println("Short value is:" + obj.s);
        System.out.println("Int value is :" + obj.i);
        System.out.println("float value is : " + obj.f);
        System.out.println("long value is :" + obj.l);
        System.out.println("double value is :" + obj.d);
        System.out.println("boolean value is :" + obj.flag);
        System.out.println("char value is :" + obj.ch);
        System.out.println("string value is :" + obj.name);
    }
}
