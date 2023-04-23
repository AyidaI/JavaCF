package com.java.arrays;

import java.util.Arrays;

public class StringSplitPractice2 {
    public static void main(String[] args) {
        String str = "The longest word in any given language depends on the word " +
                "formation rules of each specific language, " +
                "and on the types of words allowed for consideration. " +
                "A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward. ";
//find out words that has even numbers of characters
        //print out those words

        str=str.replace(".", "").replace(",","");
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i=0; i< words.length; i++){
            if(words[i].length() % 2==0){
                System.out.println(words[i]);
            }

            }
        }
    }

