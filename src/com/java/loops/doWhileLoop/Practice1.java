package com.java.loops.doWhileLoop;

public class Practice1 {
    public static void main(String[] args) {
        //for 10 times with while
        int a=1, b=10;

        while(a<=b){
            System.out.print(a +" ");
            a++;
        }
        //for 10 times with do while loop
        int num1=1, num2=10;

        do{
            System.out.println("$$$"+" ");
            num1++;
        }while(num1>num2);
    }
}
