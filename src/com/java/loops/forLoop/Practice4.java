package com.java.loops.forLoop;

public class Practice4 {
    public static void main(String[] args) {
        //print out alphabet as uppercase letters
        //A,B,C, ...Z

        for(char ch='A'; ch<='Z'; ch++ ){

            if(ch=='Z'){
                System.out.println(ch);
            }else{
                System.out.print(ch+ "*");
            }}

            for(char ch='a'; ch<='z'; ch++ ){

                if(ch=='z'){
                    System.out.println(ch);
                }else{
                    System.out.print(ch+ "*");
                }
        }
            //print out digits by separating them with $ ( 0to 9)
        System.out.println("===============");
        for(char ch='0'; ch<='9'; ch++) {
            if (ch == '9') {
            System.out.println(ch);
        }else{
            System.out.print(ch+"-$$-");
        }
    }
}}
