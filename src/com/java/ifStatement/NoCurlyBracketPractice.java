package com.java.ifStatement;

public class NoCurlyBracketPractice {
    public static void main(String[] args) {

    if(5==5)
        System.out.println("Hi");  //Hi
        System.out.println("Hello");  //Hello
        System.out.println("================");

        if(5==8 && 3<4)
            System.out.println("Hi");  //scip that
        System.out.println("Hello");  //Hello
       System.out.println("================");

        if(5< 5)
            System.out.println("Hi");
        System.out.println("Hello");  //Hello

}}
