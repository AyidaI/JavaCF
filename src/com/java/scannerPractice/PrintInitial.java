package com.java.scannerPractice;

import java.util.Scanner;

public class PrintInitial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first name");
        //to take string data, nextLine() or next()
        char firstInitial = scanner.nextLine().charAt(0);
        System.out.println(firstInitial);

        System.out.println("Please enter your last name");
        char lastInitial = scanner.nextLine().charAt(0);
        System.out.println(lastInitial);

        //can we combine first and last initials
      //  System.out.println( firstInitial+lastInitial);  need add text without give you numbers
        System.out.println("Your initials: "+ firstInitial+lastInitial);
    }
}
