package com.java.string;

public class StringMethods1 {
    public static void main(String[] args) {
//Find the second space's index number
        String word = "Java is getting easy :)";

        System.out.println(word.indexOf(' ', word.indexOf(' ')+1));   //7
        System.out.println(word.indexOf("Java is getting easy :)"));   //0
        System.out.println(word.indexOf("easy :)"));  //16

    }
}
