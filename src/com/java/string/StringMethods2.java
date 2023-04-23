package com.java.string;

import java.util.Scanner;

public class StringMethods2 {
    /*
    Task: get a String fromUser via scanner and
    print:
    -first char
    -last char
    -index of second matching letter 'c
    -length of string
    -index of 'x'
    -middle char
     */
    public static void main(String[] args) {

    Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a String value");
        String userInput = scanner.nextLine();
        System.out.println(userInput.charAt(0));    //first char
        System.out.println(userInput.charAt(userInput.length()-1));  //last char
        System.out.println(userInput.indexOf('c',userInput.indexOf('c')+1));   //second 'c' index number
        System.out.println(userInput.length());   // length of string
        System.out.println(userInput.indexOf('x'));    //index of x
        System.out.println(userInput.charAt( userInput.length() / 2));  //middle char
}}
