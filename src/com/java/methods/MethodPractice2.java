package com.java.methods;

import java.util.Scanner;

public class MethodPractice2 {
    public static void main(String[] args) {
        MethodPractice2 john =new MethodPractice2();
       double call1= john.test1(3.2, 1.8, "multiply");
        System.out.println(call1);

        double call2= john.test1(4.2, 4.5, "add");
        System.out.println(call2);
        john.ageCalculator();
        john.ageCalculator(1999);

        john.ageCalculator(1978);
        short a=2021;
        john.ageCalculator(a);

    }
    //create a method that will take two double numbers and an operation name
    // this method will return the result
    //*operation--> addition or multiplication

    public double test1(double num1, double num2, String operationName) {
        if (operationName.equalsIgnoreCase("multiply")) {
            double result = num1 * num2;
            return result;
        } else {
            double sum = num1 + num2;   //or return result=num1+ num2;
            return sum;
        }

    }
        //create a method that will find out your age
        //return and print the age
        public int ageCalculator(){
            System.out.println("=================");
            //current year - birth year
            int age = 2022 - 1980;
            System.out.println("Your age is "+ age);
            return age;
        }
    public short ageCalculator(int birthYear){

        //current year - birth year
        short age = (short)(2022 - birthYear);
        System.out.println("Your age is "+ age);
        return age;

    }
    public int ageCalculator(int currentYear, int birthYear){

        //current year - birth year
        int age=currentYear - birthYear;
        System.out.println("Your age is "+ age);
        return age;
    }
    public int ageCalculator(short currentYear){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your birth year?");
        int birthYear=sc.nextInt();
        int age=currentYear - birthYear;
        System.out.println("Your age is "+ age);
        return age;


    }
}
