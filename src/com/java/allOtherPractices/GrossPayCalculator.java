package com.java.allOtherPractices;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {   //create default method in Java. Main method is starting point
//        1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();

//         2. Get the hourly pay rate
        System.out.println("Enter employee's pay rate.");
        double rate= sc.nextDouble();

//         3. Multiply hours and pay rate
        double grossPay = hours * rate;


//          4. Display result
        System.out.println("The employees gross pay is $"+grossPay);

    }
}
