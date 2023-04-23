package com.java.interviewQuestion;

public class Reverse_String2 {
    public static void main(String[] args) {
        String str="Moon";
        int len=str.length();
        String rev="";

        for(int i=len-1; i>=0; i-- ){
            rev+=str.charAt(i);
    }
        System.out.println(rev);
    }
}
