package com.java.ifStatement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        figure out if a number is even or odd number
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        if(num%2 ==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
