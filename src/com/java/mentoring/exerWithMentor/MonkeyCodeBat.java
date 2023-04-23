package com.java.mentoring.exerWithMentor;

import java.util.Scanner;

public class MonkeyCodeBat {
    public static void main(String[] args) {
        /*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling.
        Return true if we are in trouble.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is monkey 1 is smiling");
        boolean aSmile = scanner.nextBoolean();
        System.out.println("Is monkey 2 is smiling");
        boolean bSmile = scanner.nextBoolean();

        if(aSmile == bSmile){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
