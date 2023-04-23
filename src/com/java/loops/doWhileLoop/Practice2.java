package com.java.loops.doWhileLoop;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        use do while to solve
        get to positive integer numbers from user and find sum of the range
        2,7--> 3+4+5+6=18
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive integer numbers");
        int num=scanner.nextInt();
        int num2 = scanner.nextInt();
        num=num+1;   //increasing num by 1
        int sum=0;


        do{

            sum+=num;
            num++;

        }while(num < num2);

        System.out.println(sum);
    }
}
