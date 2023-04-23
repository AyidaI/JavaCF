package com.java.RecapWithAhmet.day2;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        /*
        String str="Hello Java is so good"

output:olleH avaJ si  os doog
       avaJ
       si
       os
       doog
         */

        String str="Hello Java is so good";
        String[] array=str.split(" ");
        System.out.println(Arrays.toString(array));

        String reverse="";
        for(String word : array ){
            reverse="";
            for(int i=word.length()-1; i>=0; i--){
                reverse+=word.charAt(i);
            }
            System.out.println(reverse);
        }

    }
}
