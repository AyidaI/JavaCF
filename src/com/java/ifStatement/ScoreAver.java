package com.java.ifStatement;

import java.util.Scanner;

public class ScoreAver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score");
        int score=sc.nextInt();
        int t1=0, t2=0, t3=0, average=0;
        average=(t1+t2+t3)/3;

        if(average>= 90 && average <= 100){
            System.out.println("Your grade A");
        }else if(average >= 80 && average<= 89){
            System.out.println("Your grade B");
        }else if(average >= 70 && average<= 79){
            System.out.println("Your grade C");
         }else if(average >= 60 && average<= 69){
        System.out.println("Your grade D");
    }else{
            System.out.println("Please come again");
        }
}}
