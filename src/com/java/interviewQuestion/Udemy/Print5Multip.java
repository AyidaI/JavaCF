package com.java.interviewQuestion.Udemy;



public class Print5Multip {
    public static void main(String[] args) {
        /*
        Print 5 Multiplication table without using Multiply operator
         */

        int [] a={1, 2, 3, 4, 5};
        int sum=sumArray(a);
        System.out.println(sum);

        int result = multiply(5,10);
        System.out.println(result);

    }

    private static int multiply(int i, int j) {
//I have to sum itself j times to get result Approach/algorithm
        int k=1;
        int sum=0;

        while(k<=j){
            sum=sum+i; //5 ->10  and 5 x 10 times
            k++;
        }
        return sum;
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

