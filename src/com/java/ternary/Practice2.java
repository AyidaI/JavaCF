package com.java.ternary;

public class Practice2 {
    public static void main(String[] args) {

        String str = "Techtorial";
        String str1 = new String("Techtorial");

  String result =  'a' =='a' ?  str.concat(" Academy") : str.replace("tech", "TECH");
        System.out.println(result);   //Techtorial Academy

        System.out.println( 'a' =='a' ?  str.concat(" Academy") : str.replace("tech", "TECH"  ));  //Techtorial Academy

        System.out.println(  'a' > 'a' ?  str.concat(" Academy") : str.replace("tech", "TECH"));  //Techtorial
    }
}
