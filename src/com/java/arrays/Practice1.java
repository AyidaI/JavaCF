package com.java.arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] numbers={72, 11, 0,0, 88,55, 0,12,0 };
//print out "bye" if elements is greater than 50 in the array

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>50){
                System.out.println("Bye");
            }
        }

    }
}
