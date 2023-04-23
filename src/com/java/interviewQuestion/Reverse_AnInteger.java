package com.java.interviewQuestion;

public class Reverse_AnInteger {
    public static void main(String[] args) {
        int num =123345;
        int rev=0;

        while(num !=0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
