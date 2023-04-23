package com.java.mentoring;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Using a scanner enter a sentence that is not separated by space and each word starts with upper case. Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava" Output: I Want To Learn Java Example-2:
Given Value: "ItIsSunnyOutside" Output: It Is Sunny Outside
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String str = sc.nextLine();
        String newStr = "";

        for(int i=0; i<str.length(); i++){
         char letter =  str.charAt(i);
         if(i==0){
             newStr = newStr+" "+letter;
         }else if(letter>= 'A' && letter<='Z'){
             newStr = newStr+" "+letter;
         }else
             newStr=newStr+letter;
        }
        System.out.println(newStr);
    }
}
