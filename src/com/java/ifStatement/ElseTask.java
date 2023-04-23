package com.java.ifStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("How much is your spending");
        double amount = sc.nextDouble();
        System.out.println("What is your state");
        sc.nextLine();
      String state= sc.nextLine();
        double tax = 0;

      if(state.equalsIgnoreCase("tx") || state.equalsIgnoreCase("texas")) {
          tax = amount*0.045;
      }else{
          tax=amount*0.1;
      }
        if(amount >= 1000){
            double discount1 = amount * 0.20;
            amount=(amount-discount1)+tax;

            System.out.println("Your saving is " + discount1);
            System.out.println("Your final payment after 20% discount "+ amount);

    }else{
            double discount2 = amount * 0.05;
            amount=(amount - discount2) +tax;
            System.out.println("Your saving is " + discount2);
            System.out.println("Your final payment after 5% discount " + amount);

        }
    }
}
