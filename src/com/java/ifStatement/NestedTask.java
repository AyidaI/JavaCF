package com.java.ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class NestedTask {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!, \n Do you know any coding language? Yes/No ");
        String java = sc.nextLine().toLowerCase();

        if(java.equals("yes")){
            System.out.println("Do you know Selenium? yes/no");
            String selenium=sc.nextLine().toLowerCase();

            if(selenium.equals("yes")){
                System.out.println("Do you know API testing? Yes/no");
                String api=sc.nextLine().toLowerCase();

                if(api.equals("yes")){
                    System.out.println("Do you know SQL? yes/no");
                    String sql=sc.nextLine().toLowerCase();

                    if(sql.equals("yes")){
                        System.out.println("You are HIRED!");
                    }else{
                        System.out.println("Please learn SQL");
                    }

                }else{
                    System.out.println("Please learn API");
                }

            }else{
                System.out.println(" Please learn Selenium");
            }

        }else{
            System.out.println("Please learn coding language firs! ");

        }
    }
}
