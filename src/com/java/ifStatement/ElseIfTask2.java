package com.java.ifStatement;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("Your number is positive");
        }else if(num<0){
            System.out.println("Your number is Negative");
        }else {
            System.out.println("Your number is Zero");
        }

    }}

