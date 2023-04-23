package com.java.mentoring.exerWithMentor;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and print only unique letters combined as String also without any space in the beginning and at the end.
Example -1 :
Given Value: "i am happy"
Output: i am hpy
Example-2:
Given Value: " contribute"
Output: contribue
Example-3:
Given Value: " i want cup of coffee " Output: i want cup of e
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String str = scanner.nextLine();

        String uniqueLetters="";
        for(int i=0; i<str.length(); i++){
            String letter = str.charAt(i)+"";
            if(!uniqueLetters.contains(letter)){
                uniqueLetters+=letter;
            }else if(letter.equals(" ")){
                uniqueLetters+=letter;
            }
        }
        System.out.println(uniqueLetters);
    }
}
