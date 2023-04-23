package com.java.allOtherPractices;

import java.util.Scanner;

//Nested ifs
//to qualify for a loan,a person must make at least $30k and
// have been working at their curreb=nt job for at least 2 years
public class LoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmp = 2;

        // Get what we don't know
        System.out.println("Enter your salary:");
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = sc.nextDouble();
        sc.close();

        //Make decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmp){
                System.out.println("Congrats! you qualify for the loan");
            }else{
                System.out.println("Sorry, you must have worked at your current job"
                + requiredYearsEmp + " years.");
            }
        }else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary
            + " to qualify for a loan");
        }
    }
}
