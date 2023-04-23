package com.java.loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {

        String str= "It is a cloudy day in Chicago";
        //print out>> "I found a lowercase 'c'"
        // when you see a lowercase 'c'
        //count how many 'c' in the String
        int counter =0;

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)=='c'){
                counter++;
                System.out.println("I found a lowercase 'c' ");//I found a lowercase 'c'

            }
        }
        System.out.println("I found "+counter+ " 'c's in the String");   //I found 2 'c's in the String
    }
}
