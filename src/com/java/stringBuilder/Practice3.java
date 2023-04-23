package com.java.stringBuilder;

public class Practice3 {
    public static void main(String[] args) {
        StringBuilder success = new StringBuilder("Tech");
        System.out.println(success.length());
        success.append("nology");
        System.out.println(success); //Technology

        System.out.println(success.substring(5));    //ology
        success.substring(5);
        System.out.println(success);  //Technology
        String str= success.substring(5);

        StringBuilder bl2 = new StringBuilder(success.substring(5));
        System.out.println(bl2);  //ology
        System.out.println(bl2.equals(str));
        System.out.println(str.equals(bl2));
    }
}
