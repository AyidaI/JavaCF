package com.java.loops.doWhileLoop;

public class Practice5 {
    public static void main(String[] args) {

        //String sentence = "I can do it on my own this time":
        // find letters 'o' and 'O' and count them
        String sentence = "I can do it on my own this time";
        int countLetter = 0, indexNumber1 = 0;

        do {
            char c = sentence.charAt(indexNumber1);

            if (c == 'o' || c == 'O') {
                countLetter++;

            }
            indexNumber1++;

        } while (indexNumber1 < sentence.length()) ;
            System.out.println(countLetter);
        }
    }

