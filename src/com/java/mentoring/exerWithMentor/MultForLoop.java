package com.java.mentoring.exerWithMentor;

public class MultForLoop {
    public static void main(String[] args) {
        /*
        1*1=1
        1*2=2


        5*10=50
         */
        int mul=0;
        for(int i=1; i<=5; i++){

            for(int k=1; k<=10; k++){
                mul=i*k;

                System.out.println(i+" * "+k+" = "+mul);
            }
            System.out.println("============");
        }
    }
}
