package com.java.wrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str="1234";
        String str2="5678";

        System.out.println(str+str2);   //concat --> 12345678

        //parse
        int num = Integer.parseInt(str);  //parsing String to integer
        Integer num1 = Integer.parseInt(str);  //parse and autobox

        Short num3 = Short.parseShort(str2);
        System.out.println(num+num3);   //6912
        System.out.println("====================");

        //cannot convert string text "abcd" to the integer
        String str3 ="abcd";
    //    int i3 = Integer.parseInt(str3);
    //    System.out.println(i3);  //NumberFormatException

        //valueOf() --> convert primitive to String
        int num4= 12;
        String numAsString = String.valueOf(num4);
        System.out.println(numAsString+10);   //1210

        boolean bl = true;
        String booleanAsString = String.valueOf(bl);
        System.out.println(booleanAsString.toUpperCase()); //TRUE


    }
}
