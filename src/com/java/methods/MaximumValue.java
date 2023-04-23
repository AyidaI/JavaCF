package com.java.methods;

public class MaximumValue {
    public static void main(String[] args) {


        System.out.println();

    }
    /*
   4,3,2,1
   4*1000
   3*100
   2*10
   1*1
     */
    public long combineNumbers(int[] array) {
        int[] arr = {2, 66, 3, 90, 1, -10};
        String str="";
        for (int i = 0; i < array.length; i++) {
           int number = 0;
            if (array[i]>0){
              str+=array[i];
            }else{
                String te =array[i]+"";
                str+=te.substring(1);
            }}

        long num=Long.parseLong(str);
        return num;

    }}
