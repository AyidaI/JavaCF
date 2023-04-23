package com.java.RecapWithAhmet.day4;

public class StringBuilderPractice {
        public static void main(String[] args) {
         //Immutability
        String name = "Ahmet";
       name = name.replace("m", "*").concat(" Loves ").concat(" Java  ").trim();
        System.out.println(name);  //Ah*et Loves  Java

        //Mutability
        StringBuilder builder = new StringBuilder("Ahmet");
        builder.replace(2, 3, "*").append(" Loves ").append("Java  ").trimToSize();
        System.out.println(builder);  //Ah*et Loves  Java

        System.out.println(builder.reverse());  //avaJ sevoL te*hA

        System.out.println("+++++++++++++++");
        String reverse=String.valueOf(builder.reverse());
        System.out.println(reverse);  //Ah*et Loves Java

        System.out.println("=============");
        String reverse2= builder.reverse().toString();
        System.out.println(reverse2);// avaJ sevoL te*hA


        StringBuffer stringBuffer=new StringBuffer();

    }
}