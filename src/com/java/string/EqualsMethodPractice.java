package com.java.string;

public class EqualsMethodPractice {
    public static void main(String[] args) {
        //equals();
        String name1="Dmitriy";//stored in the String Pool
        String name2="Dmitriy";//stored in the String Pool
        String name3=new String("Dmitriy");//stored in the heap memory

        System.out.println(name1.equals(name2));  //true
        //==
        System.out.println(name1==name2);   //true

        System.out.println(name1.equals(name3));  //true
        System.out.println(name1 == name3);    //false
    }
}
