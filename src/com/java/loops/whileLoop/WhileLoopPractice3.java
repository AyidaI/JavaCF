package com.java.loops.whileLoop;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
/*
find divisor number
 */
        int num = 12;
        int divisor = 1;

        while (divisor <= num) {

            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
