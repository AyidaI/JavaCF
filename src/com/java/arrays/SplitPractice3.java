package com.java.arrays;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {

        String str="Sunday is daddy day";
       String[] parts1 = str.split("d");
        System.out.println(Arrays.toString(parts1));  //[Sun, ay is , a, , y , ay]

        String[] parts2=str.split("d", 3);
        System.out.println(Arrays.toString(parts2)); //[Sun, ay is , addy day]

        // 12/23/2022
        // 12.23.2022
        // 23-12-2022


        //If the day is 23 of December. print out "Happy Birthday!!"
      String date1= "12-23-2022";
      String[] arr1=date1.split("-");

        System.out.println(Arrays.toString(arr1));//[12, 23, 2022]

        if( arr1[0].equals("12") && arr1[1].equals("23")){
            System.out.println("Happy Birthday!!");

        }
        String date2 = "12.23.2022";
        String[] arr2 = date2.split("\\.");
        System.out.println(Arrays.toString(arr2)); //[12, 23, 2022]

    }
}
