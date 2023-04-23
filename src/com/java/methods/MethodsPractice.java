package com.java.methods;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class MethodsPractice {
    public int name() {

        return 'a';
    }

    public static void main(String[] args) {
        MethodsPractice method = new MethodsPractice();
        int sumOfNumbers = method.sum(23, 5);
        System.out.println(sumOfNumbers);
        System.out.println(method.sum(23, 5));


        double division = method.sum(10, 5);
        System.out.println(division);

        String word = method.sayHello();
        System.out.println(word);

        String[] names = {"Kate", "Ashely", "Lilly", "Lisa"};
       String nameWithA= method.wordStartsWithA(names);
        System.out.println(nameWithA);



    //    String letter = method.name();
     //   System.out.println(letter);
    }

    public String wordStartsWithA(String[] array) {
        for (String word : array) {
            if (word.startsWith("A")) {
                return word;
            }
        }
        return null;
    }
public void name(String shirt){

}
    public int sum(int num1, int num2){
        int sum =num1+num2;
        return sum;
    }
    public String sayHello(){
        return "Hello";
    }
    public double division(double num1, double num2){
        return num1/num2;
    }

}



