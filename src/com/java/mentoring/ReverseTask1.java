package com.java.mentoring;

public class ReverseTask1 {
    public static void main(String[] args) {


        String str = "Java";
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--){
            reverseStr+=str.charAt(i);
        }
        System.out.println(reverseStr);

    }
}
