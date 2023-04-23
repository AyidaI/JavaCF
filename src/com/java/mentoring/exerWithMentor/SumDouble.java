package com.java.mentoring.exerWithMentor;

import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        /*
        Given two int values, return their sum. Unless the two values are the same, then return double their sum.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number");
        double a=scanner.nextDouble();
        System.out.println("Please enter second integer number");
        double b=scanner.nextDouble();
        double sum=a+b;

        if( a ==b ){
            System.out.println(sum=sum*2);
        }else{
            System.out.println(sum);
        }

    }
}
