package com.java.allOtherPractices.chirags.array;

import javax.sound.midi.Soundbank;

public class CountNumberOfOddEvenFromEachRow {
    public static void main(String[] args) {


        int data[][] = {{34, 6, 7, 23, 8, 90, 35, 76},
                {52, 23, 65, 12, 5, 21, 5, 7},
                {34, 6, 2, 33, 7, 3, 2, 6}};


        for (int i = 0; i < data.length; i++) {
            int countEven = 0;
            int countOdd = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            System.out.println("========Row "+i+"=========");
            System.out.println(countEven);
            System.out.println(countOdd);
        }
    }
}
