package com.java.loops.whileLoop;

public class WhileLoopPractice5 {
    public static void main(String[] args) {

        /*
        find sum of numbers between 10 and 15
        10+11+12+13+14+15=75
        "sum of the numbers between 10 to 15 is: "+sum
         */
        int num=10, num2=15;
        int sum=0;

        while(num <=num2) {
            sum += num;

            num++;
        }

            System.out.println("sum of the numbers between 10 to 15 is: "+sum);

        if(sum%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("+++++++++++======");
        //find the sum of the even number from 1 to 15  2+4+6+8+10+12+14=56
        int num3=1, num4=15, total=0;

        while(num3 < num4) {

            if (num3 % 2 == 0) {
                total += num3;
            }
            num3++;
        }
             System.out.println(total);
        }
}
