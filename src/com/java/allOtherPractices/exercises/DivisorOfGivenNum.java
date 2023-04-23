package com.java.allOtherPractices.exercises;

import java.util.Scanner;

public class DivisorOfGivenNum {
    public static void main(String[] args) {
//12 --> 1, 2, 3, 4,6, 12
        System.out.println("Please enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1; i<=num; i++){
            if(num % i==0){
                System.out.print(i +"  ");

            }
        }


    }
}
