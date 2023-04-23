package com.java.arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        String[] studentNames = new String[9];

        studentNames[0] = "Alex";
        studentNames[1] = "Ana";
        studentNames[2] = "Dilyana";
        studentNames[3] = "A O";
        studentNames[4] = "Stan";
        studentNames[5] = "Diana";

        System.out.println(Arrays.toString(studentNames));  //[Alex, Ana, Dilyana, A O, Stan, Diana, null, null, null]

        //print out the name if the name has letter 'l' into it

        for (char ch = 0; ch < studentNames.length; ch++) {

            if (studentNames[ch] == null) {
                continue;
            }
            if (studentNames[ch].contains("l")) {

                System.out.println(studentNames[ch]);
            }
        }
        System.out.println("==============");


        for (char ch = 0; ch < studentNames.length; ch++) {

            if (studentNames[ch] != null) {

                if (studentNames[ch].contains("l")) {

                    System.out.println(studentNames[ch]);
                }

            }
        }
    }
}
