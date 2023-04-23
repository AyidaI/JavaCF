package com.java.mentoring.SaraMent;

import java.util.Scanner;

public class Password {
    /*
    User is asked to enter a password in main class.
We should write a program to check password by following steps
1 - > If the string doesn't have any upper case
      letter or any lower case letter print
      "Your password is not acceptable"
2 - > If the first character of the password is upper case letter and
      the last character of the password is not letter print
      "Your password is strong".
3 - > If first character of the password is lower case letter and
      the last character of the string is upper case print
      "Your password should be improved"
4 - > For all other conditions print
      "Your password is not valid"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false, hasLower = false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                hasUpper = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
                hasLower = true;
            }
        }

        if (!hasUpper || !hasLower){
            System.out.println("Your password is not acceptable");
        } else if (Character.isUpperCase(password.charAt(0))&&!Character.isLetter(password.charAt(password.length()-1))) {
            System.out.println("Your password is strong");
        } else if (Character.isLowerCase(password.charAt(0))&& Character.isUpperCase(password.charAt(password.length()-1))) {
            System.out.println( "Your password should be improved");
        }else{
            System.out.println("Your password is not valid");
        }

    }
}
