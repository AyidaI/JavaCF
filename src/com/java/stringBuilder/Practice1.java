package com.java.stringBuilder;

public class Practice1 {

    //create a program to print uppercase alphabet as a single String

    public static String alphabet(){
        String str="";

        for(char c='A'; c<='Z'; c++){
            str+=c;
            System.out.println(str);
        }

        return str;

    }

    public static void main(String[] args) {
        alphabet2();

       String str1= alphabet();
        System.out.println(str1.charAt(5)); //F

        StringBuilder builder=new StringBuilder("Sunny");
        System.out.println(builder);  //Sunny

        StringBuilder builder1=new StringBuilder();
       // builder1="Winter"; --> compile time error
        builder1.append("Winter");
        System.out.println(builder1);   //Winter

        builder1.append(" is not having snow for this year");
        System.out.println(builder1);  //Winter is not having snow for this year

        builder1= builder1.append(" is not having snow for this year");
        System.out.println(builder1); //Winter is not having snow for this year is not having snow for this year

        builder1.append(builder1.append(" *** "));
        System.out.println(builder1);
    }
    static public  void alphabet2(){
        StringBuilder builder2= new StringBuilder();


        for(char ch='a'; ch<='z'; ch++){
            builder2.append(ch);
            System.out.println(builder2);
        }


}}
