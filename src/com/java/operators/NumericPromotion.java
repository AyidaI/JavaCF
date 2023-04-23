package com.java.operators;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1=6;
        byte b2=3;

       //byte sum1= b1+b2;   compile time error
       int sum1= b1+b2;
        System.out.println(sum1);

        double d1=3.2;
        int i1=3;
        double result = d1*i1;    //java automatically promotes to decimal numeric data type(double)
        System.out.println(result);
    }
}
