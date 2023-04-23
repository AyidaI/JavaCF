package com.java.ifStatement;

import java.util.Scanner;

public class NestedPractice2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your city name");
        String city=sc.nextLine();

        city = city.toLowerCase();

        if(city.equals("chicago")) {
            System.out.println("What is your school name?");
            String school = sc.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky!");

            } else {
                System.out.println("please come and visit Techtorial!");
            }
        }else if(city.equals("Miami")){
            System.out.println("You should be attending miami campus!");
            System.out.println("What is your school name?");
            String school = sc.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky!");

            } else {
                System.out.println("please come and visit Techtorial!");
            }

        }else{
            System.out.println("Please come to Chicago and visit us!");
        }
    }
}
