package com.java.arrays;

import java.util.Arrays;

public class StringPractice1 {
    public static void main(String[] args) {

        String str1= "Selenium";
      String[] parts =  str1.split("n");
        System.out.println(Arrays.toString(parts));    //[Sele, ium]
        System.out.println(parts[1]);//ium

        parts[1] ="love";
        System.out.println(Arrays.toString(parts));  //[Sele, love]


        //store every word in an array
        String str2 = "It is a good day to practice java. Snow is outside. ";

        str2=str2.replace(".", "!");
        System.out.println(str2); //It is a good day to practice java! Snow is outside!

        //store every word in an array
        String[] parts2 = str2.split(", ");
        System.out.println(Arrays.toString(parts2)); //[It is a good day to practice java! Snow is outside! ]


}}
