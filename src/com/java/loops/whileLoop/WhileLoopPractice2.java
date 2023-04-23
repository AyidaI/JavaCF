package com.java.loops.whileLoop;

import java.util.Scanner;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        /*
        you/user $100
        ask user how much is the spending amount
        -if the spending amount is less than balance keep asking user and let him to spent more
        -if the pending amount is greater than balance  --> "you do not have enough money to spend!"
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("I have $100 to spend. how much do you want to spent? ");
       int amount=scanner.nextInt();
        int money=100;

        while(money>0){
            money-=amount;
            if(money>0) {
                System.out.println("Your balance is " + money + " how much do you want to spent?");
                amount=scanner.nextInt();
            }else{
                System.out.println("you do not have enough money to spend!");
            }

        }
    }
}
