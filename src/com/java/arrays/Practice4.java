package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

/*
    lindor, milka, twix, ferraro, snickers, m&m
    if the name has 5 or less lstters store it in to shortNames array
    otherwise store it in longNames array
 */
        System.out.println("How many chocolates  you want to store?");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];
        String[] shortNames = new String[size];
        String[] longNames = new String[size];


        for (int i = 0; i < size; i++) {

            System.out.println("Please enter name of chocolate " + (i + 1));
            String str = sc.nextLine();
            names[i] = str;

                if(str.length() > 5 ){
                    longNames[i]=str;
        }else {
                    shortNames[i] = str;
                }}
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(longNames));
    }
}

//lindor, milka, twix, ferraro, snickers, m&m