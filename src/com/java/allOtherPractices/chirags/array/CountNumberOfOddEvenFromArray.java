package com.java.allOtherPractices.chirags.array;

public class CountNumberOfOddEvenFromArray {
    public static void main(String[] args) {
        //write a program to count number of odd / even number from array
        int data[]={34, 6,7,23,8,90,35,76};
        int countEven=0;
        int countOdd=0;
        for (int i = 0; i < data.length ; i++) {
            if(data[i] % 2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println(countEven);  //5
        System.out.println(countOdd);  //3
    }
}
