package com.java.loops.doWhileLoop;

public class Practice4 {
    public static void main(String[] args) {

        /*
        String str = "@$%SdvH&S345";
        count the num of letters-->letters count ->5
        count the num of digits --> digit count ->3
        count the num of other symbol --> symbol count -> 4
         */
        String str = "@$%SdvH&S345";
        //how to take a char fom a String?
        str.charAt(0);  //->@

        //how to check if characters is letter/ digit/ symbol

        if (str.charAt(0) >= 'a' || str.charAt(0) >= 'z') ;

        //how to execute something repeatedly?
        //need to create a loop
        int indexNumber = 0, letterCounter = 0, digitCounter = 0, symbolCounter = 0;

        do {

            char ch = str.charAt(indexNumber);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letterCounter++;
            } else if (ch >= '0' && ch <= '9') {
                digitCounter++;
            } else {
                symbolCounter++;
            }
            indexNumber++;

        } while (indexNumber < str.length());
        System.out.println("Letter Count -->" + letterCounter);
        System.out.println("Digit Count -->" + digitCounter);
        System.out.println("Symbol Count -->" + symbolCounter);
    }

    }



