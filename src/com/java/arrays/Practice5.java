package com.java.arrays;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        int[] nums = {4,12, 43, 3,5,8,6,78};

        System.out.println(nums.length);  //8--> size or count of element
        System.out.println(nums[4]);  //5

        System.out.println(Arrays.toString(nums)); //[4, 12, 43, 3, 5, 8, 6, 78]

        nums[1]=45;  // giving a new value to index 1
        System.out.println(Arrays.toString(nums));  //[4, 45, 43, 3, 5, 8, 6, 78]
        System.out.println("====================");

     //   nums[8]=11;  //ArrayIndexOutOfBoundsException  --> array index start with 0

        //multiply each elements by 10 and print out the result

//        for(int i=0; i<nums.length; i++){
//            nums[i]=nums[i]*10;
//
//            System.out.print(nums[i]+" ");  //40 450 430 30 50 80 60 780
//        }
        //multiply the nums that are greater than 10 by 100 and print out the result
        System.out.println("=====================");
        for(int i=0; i<nums.length; i++) {
            if (nums[i] >10){

            nums[i] = nums[i] * 100;
            System.out.print(nums[i]+" ");  //4500 4300 7800

        }
    }
}}
