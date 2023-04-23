package com.java.string;

public class StringMethod4 {
    public static void main(String[] args) {

        //trim()
        String str = "   today is     so quiet   ";
       String noSpaceString = str.trim();
        System.out.println(noSpaceString);


//method chaining (able to call/us another method after method call

        int number= str.trim().replace('t', 'T').substring(2, 8).length();
        System.out.println( number );  //6
        System.out.println("=============");

        //String quote ="  From Zero to HERO   ";
        /*
        replace zero with 'one'
        make entire string as upperCase
        remove All spaces
        get a tree letter substring from the end
        print whatever you have left with
         */

        String quote ="  From Zero to HERO   ";
//        String str2=quote.replace("Zero", "One");
//        System.out.println(str2);  //From One to HERO
//       String  wordUpperCase=quote.toUpperCase();
//        System.out.println(wordUpperCase);  // FROM ZERO TO HERO
        String result2 = quote.replace("Zero", "One").toUpperCase().trim().replace(" ","");

        String result3 = result2.substring(result2.length()-3);
        System.out.println(result3);  //ERO


    }
}
