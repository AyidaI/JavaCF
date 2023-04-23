package com.java.mentoring.exercises;

import java.util.Scanner;

public class SumOfMinAndMax {
    /*
    Using the scanner asks the usser to print the min and max num.
    write a java code that will calculate the sum of nums between the range of min
    and max and those that can only be divided by 3 and 11.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the min number");
        int min= sc.nextInt();
        System.out.println("Please enter the max number");
        int max=sc.nextInt();
        int sum=0;

        for(int i=min; i<=max; i++){
            if(i%3 ==0 && i%11==0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}
