package com.java.interviewQuestion.BeknazarTechlead;

import java.util.Scanner;

/*
Write a method that will take one string as an argument and will
return the reverse version of this string.
reverseStr("apple")  -> elppa
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word");
        String str = scanner.nextLine();

        //create variable to store reversed version of str
        StringBuilder reverse = new StringBuilder();


        //iterate over input string from the back with chartAt
        for(int i=str.length()-1; i>=0; i--){
            //add chars to reversed variable
            reverse.append(String.valueOf(str.charAt(i)));
        }
        //convert to string and return reversed version
        System.out.println(reverse);
    }
    //Time complexity: O(n)
    //Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects
}
