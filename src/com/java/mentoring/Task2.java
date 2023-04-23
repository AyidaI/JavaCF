package com.java.mentoring;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max number.
         Write a java code that will calculate the sum of numbers between t
         he range of min and max and those that can only be divided by 3 and 11.
(min and max numbers are included) Example:
0, 120 -> 33 + 66 + 99 = 198
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the min num");
        int min = sc.nextInt();
        System.out.println("Please enter the max num");
        int max = sc.nextInt();
        int sum=0;

        for(int i=min; i<=max; i++){
            if(i % 3 ==0 && i % 11==0){
                sum+=i;
                System.out.println(i);//33 66 99 198
            }
        }
        System.out.println(sum); //198
    }
}
