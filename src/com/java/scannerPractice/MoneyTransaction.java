package com.java.scannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
        David wants to deposit his money into his bank account
        -he already got $200 in his account
        - he got three different paychecks ($480, $600, and $350)
        - he can only deposit one paycheck at a time
        -after he got his money in the account
        -he bought a phone for $599 and headfone for $299
        - calculator his final money in his account
         */
        Scanner sc = new Scanner(System.in);
       double balance = 200;
        System.out.println("Deposit first your paycheck ");
        double deposit1 = sc.nextDouble();
        balance=balance+deposit1;   // balance+=deposit1

        System.out.println("Deposit two your paycheck ");
        double deposit2 = sc.nextDouble();
        balance=balance+deposit2;   // balance+=deposit2

        System.out.println("Deposit Three your paycheck ");
        double deposit3 = sc.nextDouble();
        balance=balance+deposit3;   // balance+=deposit3
        System.out.println("Your balance after deposits is: "+balance);

        System.out.println("Please enter phone price");
        double phone$= sc.nextDouble();
        balance -= phone$;

        System.out.println("Please enter headphone price");
        double headphone$ = sc.nextDouble();
        balance -= headphone$;

        System.out.println("After buying some items your balance is: "+ balance);
    }
}
