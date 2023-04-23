package com.java.ternary;

public class Practice {
    public static void main(String[] args) {

        int a=16, b=7;
       int result= a<b ? a+b : a*b;
        System.out.println(result);  //13

       String result1 =  a != b ? "Adiition" : "Multiplication";
        System.out.println(result1);   //Adiition


        System.out.println(a >= b+9 ? 'c'  : "check");
        System.out.println("+++++++++++++");

        String str1 = "I am so lucky";
        String str2 = "It is going great";
        String day = "Sunday";
        System.out.println( day.equals("Monday") ? str2 : str1 );  //I am so lucky

        System.out.println( a > b ? ++a + ++b : --a + --b );  //25
        System.out.println("a--> "+a);  //17
        System.out.println("b--> "+b);   //8
        System.out.println("==================");

        //nested ternary
        //a > b ? ++a + ++b : --a + --b
        //day.equals("Monday") ? str2 : str1
        //day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b

        System.out.println( day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b );  //27

        System.out.println( day.equals("Monday")  ?  a >= b+9  ? 'c'   : "check"  : a > b  ?  ++a + ++b : --a + --b    );  //29
    }
}
