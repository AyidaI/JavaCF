package com.java.allOtherPractices.exercises;

import java.util.Scanner;

public class PrimeNumBoolean {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime = true;

        //2.... n-1;--> we taking out 1.....13 first and last number
        for(int i=2; i<num; i++){
            System.out.println("We are dividing "+num+" with "+i);
            if(num % i==0){
                isPrime=false;
                break;
            }
    }
        if(isPrime==true){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }
}}
