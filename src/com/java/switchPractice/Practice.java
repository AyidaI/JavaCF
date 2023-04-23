package com.java.switchPractice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        get an integer number from user
        if the number is 1 -> "It is IT department"
                           2. "It is HR department"
                           3/. It is Help Desk
                           4. It is accounting
                           cover for invalid choices as well
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println( "It is IT department" );
                break;
            case 2:
                System.out.println("It is HR department");
                break;
            case 3:
                System.out.println("It is Help Desk ");
                break;
            case 4:
                System.out.println("It is accounting ");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
