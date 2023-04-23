package com.java.interviewQuestion;
//Write code to swap three number without using extra variable.

public class SwapThreeNumWithoutExtra {
    public static void main(String[] args) {
       int a=10, b=20, c=30;
       swap(a,b,c);

    }
    public static void swap (int a, int b, int c){
        a=a+b+c;    //60 = 10+20+30
        c=a-(b+c);  // 10=  60-(20+30)
        b=a-(b+c);  // 30  =60-(20+10)
        a=a-(b+c);  //20-(30+10)

        System.out.println("a: "+a);  //a: 20
        System.out.println("b: "+b);  //b:30
        System.out.println("c: "+c);  //c: 10

    }

}
