package com.java.loops.doWhileLoop;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        for that given number, create a star tree like following
        user enters--> 5
        *
        **
        ***
        ****
        *****

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive integer numbers");
        int num=scanner.nextInt();
        String str = "*";

        do{

            System.out.println(str); //**
            str=str.concat("*");
            num--;

        }while(num > 0);


        }
    }

