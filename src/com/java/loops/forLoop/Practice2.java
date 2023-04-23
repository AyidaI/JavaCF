package com.java.loops.forLoop;

public class Practice2 {
    public static void main(String[] args) {

        /*
        find the sum of numbers between 10 and 15
         */

        int sum=0;

        for(int a=10; a<=15; a++) {
            sum += a;
        }
            System.out.println("sum--> "+sum);


        //String str ="Today is beautiful";
    //print out every letter from this given String separated by coma

    String str ="Today is beautiful";

        for(int i=0; i<str.length(); i++){

            if(i==str.length()-1){
                System.out.print(str.charAt(i));
            }else{
                System.out.print(str.charAt(i)+", ");
            }
        }
        System.out.println("=============");
        //print above style without spaces--get rid of spaces and print letters with dash
        //Approach 1
        str ="Today is beautiful";
        str=str.replace(" ", "");

        for(int i=0; i<str.length(); i++){
            if(i==str.length()-1){
                System.out.print(str.charAt(i));
            }else{
            System.out.print(str.charAt(i)+"- ");
        }}
            //Approach 2
            str ="Today is beautiful";

        System.out.println("===========");
            for(int i=0; i<str.length(); i++){
                if(i==str.length()-1 && str.charAt(i) !=' '){
                    System.out.print(str.charAt(i));
                }else if (str.charAt(i) !=' '){
                    System.out.print(str.charAt(i)+"- ");
                }

    }}}

