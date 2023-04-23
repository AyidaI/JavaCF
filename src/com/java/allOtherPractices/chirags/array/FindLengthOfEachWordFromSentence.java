package com.java.allOtherPractices.chirags.array;

public class FindLengthOfEachWordFromSentence {
    public static void main(String[] args) {
        String str = "Transform Jira Into a Powerful Test Management Tool with QMetry Test Management for Jira. " +
                "Get Quality Analytics with Test Coverage & Traceability. Make Critical Quality Decision.";
        String words[]=str.split(" ");

       for(String word :words){
           System.out.println(word+" = "+word.length());
        }
        System.out.println("=============");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+" = "+words[i].length());

        }

    }
}
