package com.java.interviewQuestion.Udemy;

public class ArrayAndReturnsSum {
    public static void main(String[] args) {
        /*
        Create a method which accepts Array and returns sum of all the elements in array
         */
        int [] a={1, 2, 3, 4, 5};
        int sum=sumArray(a);
        System.out.println(sum);
    }

    private static int sumArray(int[] a) {
        int sum=0;
        //extract every value of array and sum each value with other
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]); //1 2 3 4 5
            sum+=a[i];  //itereting --> 3 then 6 then 10 then 15

        }
        return sum;
    }


}
