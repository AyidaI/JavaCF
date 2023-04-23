package com.java.object;

public class MethodPractice {

    //create a method that will add two integer num and return the sum
    public int sumCalculator(int num1, int num2) {
        int sum = num1 + num2;  //sum is local variable
        System.out.println("Two int parameter method is running");
        return sum;    //num1+num2
    }

    public int sumCalculator(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;  //sum is local variable
        System.out.println("Three int parameter method is running");
        return sum;    //num1+num2
    }
//overload sumCalculator method to find sum of numbers from a given array
public int sumCalculator(int[] nums){
        //{2,4,5,6,7}
    int sum=0;
    for(int num:nums){
        sum+=num;
    }
    return sum;

    }

    public static void main(String[] args) {
        MethodPractice obj = new MethodPractice();
       int total1 = obj.sumCalculator(13,50);
        System.out.println(">>>>>> "+total1);

        obj.sumCalculator(3,34,11);

        int[] arr ={2,4,5,6,7};
       int total3 =  obj.sumCalculator(arr);
        System.out.println(total3);
     //   System.out.println(obj.sumCalculator(obj.sumCalculator(new int[]{3,4,5}));

    }
}
