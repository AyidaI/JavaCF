package com.java.operators;

public class Casting {
    public static void main(String[] args) {
        //Implicit
        int num=23;
        long numL=num;

        //Explicit
        int count = 25;
        short countSh = (short)count;
        System.out.println(count);   //25
        System.out.println(countSh);  //25

        int number = 128;
        byte numberBt = (byte)number;
        System.out.println(number);  // 128
        System.out.println(numberBt);  //-128

        double weight = 3.4;
        int weight2 = (int)weight;
        System.out.println(weight2);   //3

        int example = (int)25.6;

    }
}
