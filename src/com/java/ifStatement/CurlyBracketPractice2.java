package com.java.ifStatement;

public class CurlyBracketPractice2 {
    public static void main(String[] args) {

        int k=3, m=k+5, t=1;

        if(m >= k)

            t=k++  + k + m;
        ++t;
        System.out.println(--t); //15
        System.out.println(t);  //15

        if(t < ++k)  //false
            ++k;  //scip because false

        ++t;
        System.out.println(++t);//17

    }

}
