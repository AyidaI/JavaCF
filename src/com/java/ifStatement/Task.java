package com.java.ifStatement;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a letter ");
        char letter = sc.nextLine().charAt(0);

        if (letter == 'M' || letter == 'm') {
            System.out.println("It is Monday");
        }
        if (letter == 'T' || letter == 't') {
            System.out.println("It is Tuesday or Thursday");
        }
        if (letter == 'W' || letter == 'w') {
            System.out.println("It is Wednesday");
        }
        if(letter !='M' && letter != 'm' && letter != 'T' && letter != 't' && letter != 'W' && letter != 'w') {

            System.out.println("Invalid entry");

        }

    }}
