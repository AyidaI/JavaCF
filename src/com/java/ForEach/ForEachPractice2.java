package com.java.ForEach;

public class ForEachPractice2 {
    public static void main(String[] args) {
        double[] changes = {2.34, 4.5, 1.25, 3.40, 1.20};
        //by using each loop find the total of changes
        double total =0;
        for(double change : changes) {
            total += change;
        }
            System.out.println(total); //12.69

        int[] numbers = {1, 2, 3, 5,6,7};
        //find the missing number from the given pattern


//        for(int i=0; i< numbers.length; i++) {
//            if (numbers[i + 1] - numbers[i] > 1) {
//                System.out.println(numbers[i] + 1);  //4
//            }
//        }
//{1, 2, 3, 5,6,7}
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            sum+=numbers[i];
        }
        int sum2=0;
        for(int i=1; i<=7; i++){
            sum2+=i;
        }
        System.out.println("Sum - "+sum);
        System.out.println("Sum2 - "+sum2);
        System.out.println("Missing number is "+ (sum2-sum));
        }
    }

