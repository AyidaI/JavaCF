package com.java.mentoring.exerWithMentor;

import java.util.Scanner;

public class PatterForLoop {
    public static void main(String[] args) {
        /*
        #####
        #####
        #####
        #####
        #####
         */

        for(int i=0;  i<=5; i++){

            for(int k=0; k<=8; k++){

                System.out.print("#");

            }
            System.out.println();
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scanner.nextInt();
        System.out.println("Please enter the width");
        int width = scanner.nextInt();

        for(int i=0;  i<=length; i++) {

            for (int k = 0; k <= width; k++) {

                System.out.print("#");
            }
            System.out.println();
        }

    }
}
