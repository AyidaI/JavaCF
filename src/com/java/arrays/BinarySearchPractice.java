package com.java.arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        String[] drinks= {"tea",  "water", "coffee", "coke"};
        System.out.println(Arrays.binarySearch(drinks, "water")); // 1
        System.out.println(Arrays.binarySearch(drinks, "coke"));  //-1
        System.out.println(Arrays.toString(drinks)); //[tea, water, coffee, coke]
        System.out.println("===============");

        Arrays.sort(drinks);
        System.out.println(Arrays.binarySearch(drinks, "water")); // 3
        System.out.println(Arrays.toString(drinks)); //[coffee, coke, tea, water]
        System.out.println(Arrays.binarySearch(drinks, "orange"));  //-3
        System.out.println("============");

        int[] nums = {3,6,8,10,2,11};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // [2, 3, 6, 8, 10, 8, 11, 8]
        System.out.println(Arrays.binarySearch(nums, 8));  // 3

        Arrays.binarySearch(nums, 2, 5, 8);
        System.out.println(Arrays.binarySearch(nums, 2, 5, 8));  //3
        System.out.println(Arrays.binarySearch(nums, 8));


    }
}
