package com.java.switchPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        /*
        ask user for their favorite fruit
        - strawberry, mango, apple, grape banana
        "We have your favorite fruit....."+fruit;
        "Sorry! We do not have your favorite fruit.."+ fruit;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite fruit? Please enter your favorite fruit!");
        String fruit = sc.nextLine().toUpperCase();

        switch (fruit){
            case "Strawberry":System.out.println("We have your favorite fruit....."+fruit); break;
            case "Mango":System.out.println("We have your favorite fruit....."+fruit); break;
            case "Apple":System.out.println("We have your favorite fruit....."+fruit); break;
            case "Grape":System.out.println("We have your favorite fruit....."+fruit); break;
            case "Banana":
                System.out.println("We have your favorite fruit....."+fruit); break;
            default:
                System.out.println("Sorry! We do not have your favorite fruit.."+ fruit);
                break;
        }
    }
}
