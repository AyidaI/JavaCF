package com.java.RecapWithAhmet.day1;

import java.util.Scanner;

public class IfAndTernary {
    /*
   POSSIBLE INTERVIEW QUESTIONS:
    1-Most of the technical questions are required if condition
     If is a conditional statement
       If(condition){                        if(condition){
          Implementation                     else if(condition)
          else{                              else{
          Implementation
          AND (&)                               OR (||)
          TRUE & TRUE -->TRUE                  TRUE || TRUE --> TRUE
          FALSE & FALSE -->FALSE               FALSE || FALSE -->FALSE
          TRUE & FALSE -->FALSE                TRUE || FALSE --> TRUE
    */
    public static void main(String[] args) {
        /*
        -10-0--> SUPER COLD
        0-25 --> it is normal
        25-50 --> it is hot
         */

        Scanner sc=new Scanner(System.in);
        int actualTemperature = sc.nextInt();

        if(actualTemperature<0 && actualTemperature>-10){
            System.out.println("It is super cold");
        }else if(actualTemperature<25 && actualTemperature>0){
            System.out.println("It is normal");
        }else if(actualTemperature>25 && actualTemperature<50){
            System.out.println("It is hot");

        }else{
            System.out.println("The input is not applied for the conditions please check");
        }
        boolean result = actualTemperature>10 || actualTemperature <5;
        System.out.println(result);  // true

//Ternary operators: Condition ? Value1 : Value2;   --> Condition true->Value 1  False==? Value 2
        String name= "Ahmet";
        String name2= "ahmet";
        String result2 = name.equalsIgnoreCase(name2) ? "The value are matching" : "The Values are not Matching";
        System.out.println(result2);   //The value matching
    }
}
