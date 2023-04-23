package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
        ask user how many chocolate names s/he wants to store in an array
        get the names of the chocolates from user
        and store them into an array
         */

        System.out.println("How many chocolates  you want to store?");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];


        for (int i = 0; i < size; i++) {

            System.out.println("Please enter name of chocolate " + (i + 1));
            String str = sc.nextLine();
            names[i] = str;
        }
        System.out.println(Arrays.toString(names));
    }
}
