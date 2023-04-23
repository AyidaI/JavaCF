package com.java.arrays;

import java.util.Arrays;

public class MultiDimensionPractice1 {
    public static void main(String[] args) {

        int[][] nums = new int[4][3];
        nums[0][0] = 73;
        nums[0][1] = 81;

        System.out.println(Arrays.deepToString(nums));  //[[73, 81, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //store 95 to the last index of third element of the first array

        nums[2][2] = 95;
        System.out.println(Arrays.deepToString(nums));  //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 0]]

        nums[3][2] = 100;  //make it dynamic index
        System.out.println(Arrays.deepToString(nums));  //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 100]]

        nums[nums.length - 1][nums[nums.length - 1].length - 1] = 10;
        System.out.println(Arrays.deepToString(nums));

        //add 1000 to each number and print it out

        for (int i = 0; i < nums.length; i++) {

            for (int k = 0; k < nums[i].length; k++) {

            System.out.print(nums[i][k] +1000+" ");  //1073 1081 1000 1000 1000 1000 1000 1000 1095 1000 1000 1010
        }
            for(int[] arr : nums){
                for(int num : arr){
                    System.out.println(num*100);
                }
            }
    }


    }
}
