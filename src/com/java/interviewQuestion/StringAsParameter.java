package com.java.interviewQuestion;
/*
Write a program that takes a String as an argument and returns true if the first and k=last letters of a given String are the same otherwise return false
Example: car-> false, dead ->trues

 */
public class StringAsParameter {
    public boolean isLastEqualsFirst(String word) {
        int n = word.length();
        char first = word.charAt(0);
        char last = word.charAt(n - 1);
        if (first == last) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        StringAsParameter stringAsParameter = new StringAsParameter();

        System.out.println(stringAsParameter.isLastEqualsFirst("dead"));
        System.out.println(stringAsParameter.isLastEqualsFirst("car"));
    }
}

