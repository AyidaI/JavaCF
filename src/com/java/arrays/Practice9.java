package com.java.arrays;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {

        String[] brands ={"Nike", "Adidas", "Puma", "New Balance", "Reebok"};
        int[] nums= {4, 3, 5, 6, 72, 6, 8, 45};
        //sort()
    //    System.out.println(Arrays.toString(nums));  //[4, 3, 5, 6, 72, 6, 8, 45]

        Arrays.sort(nums);
  //      System.out.println(Arrays.toString(nums));  //[3, 4, 5, 6, 6, 8, 45, 72]
        System.out.println(nums[0] == 3); // true

     //   Arrays.sort(brands);
       // System.out.println(Arrays.toString(brands));  //[Adidas, New Balance, Nike, Puma, Reebok]

    }
}
