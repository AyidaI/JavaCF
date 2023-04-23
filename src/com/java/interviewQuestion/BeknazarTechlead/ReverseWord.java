package com.java.interviewQuestion.BeknazarTechlead;

/*
Reverse words. Write a method that will take a string as an argument.
The method will reverse the position of words and return it.
 */
public class ReverseWord {
    public static void main(String[] args) {
        StringBuilder reverseWords = new StringBuilder();
        String str = "I am Aida from Honolulu Hawaii";

        //split input by " " space to get each word as String
        String[] words = str.split(" ");

        //loop over the array from back
        for(int i=words.length-1; i>=0; i--){

            //add words to reverseWords with space
            reverseWords.append(words[i]+" ");
        }
        //trim needed to remove last space in the end
        System.out.println(reverseWords.toString().trim());

    }
}
