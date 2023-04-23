package com.java.mentoring.exercises;

public class ReverseAString {
    /*
    Reverse a String and print it, if they have space in the beginning and
    at the end the remove it. Try doing with for loop or while loop
     */

    public static void main(String[] args) {
        String str="Java";
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
