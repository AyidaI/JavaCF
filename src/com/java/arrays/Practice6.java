package com.java.arrays;

public class Practice6 {
    public static void main(String[] args) {

        int[] ages = {21, 23, 27,27, 23,27, 30, 35, 34, 18, 38, 19};

        //find the biggest age
        int bigNum=ages[0];
        for(int i=0; i< ages.length; i++){
            if(ages[i]> bigNum) {
                bigNum = ages[i];
            }}
            System.out.println(bigNum);  //38
        }

    }

