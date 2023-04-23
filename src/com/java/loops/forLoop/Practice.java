package com.java.loops.forLoop;

public class Practice {
    public static void main(String[] args) {
//down 20, 19, 18,17.......
        for(int num1=10, num2=20; num2>num1; num2--){

            System.out.println(num2);
        }
        for(int i=0; i<10; ){
            System.out.println(i+1+" I like for loop");
            i++;
            System.out.println(i);  //10
        }
    }
}
