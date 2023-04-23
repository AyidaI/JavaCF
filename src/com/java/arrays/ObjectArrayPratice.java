package com.java.arrays;

import java.util.Scanner;

public class ObjectArrayPratice {
    public static void main(String[] args) {

        String str = new String("Test");
        int num1=9;
        boolean bl1 = true;
        double d1 = 9.8;

        Scanner scanner = new Scanner(System.in);
        Object[] example= {str, num1,bl1, d1, scanner};
        for(Object  ex: example){
            System.out.print(ex.toString().charAt(0)+","); //T,9,t,9,j,
            System.out.println(ex.toString());
        }
    }
}
