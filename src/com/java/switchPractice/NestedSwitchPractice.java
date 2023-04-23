package com.java.switchPractice;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        /*
        1. IT dept
        -John
        -Marry
        2. Accounting dept
        -Jake
        -Askar
        3. Hr dept
        -Anna
        _Maks
        -Mike
        4. Help Desk
        -Efe
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from the following department: \n1-IT \n2-Accounting \n3-HR \n4-Help Desk");
        int department = scanner.nextInt();



        switch (department) {

            case 1:
                System.out.println("You reached out to IT department. Who do you want to speak with? John/Marry ");
                scanner.nextLine();
                String name = scanner.nextLine();
                name = name.toLowerCase();
                switch (name) {

                    case "john":
                        System.out.println("You are speaking with " + name);
                        break;
                    case "marry":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("There is no such a person like: "+name);break;
                }
                break;
            case 2:
                System.out.println("You reached out to Accounting department. Who do you want to speak with? Bill/Jake ");
                scanner.nextLine();
                String name1 = scanner.nextLine();
                name1 = name1.toLowerCase();
                switch (name1) {
                    case "bill":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "jake":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such a person like: "+name1);break;
                }
                break;
            case 3: System.out.println("You reached out to HR department. Who do you want to speak with? Anna/Diana/Mike ");
                scanner.nextLine();
                String name2 = scanner.nextLine();
                name2 = name2.toLowerCase();


                switch (name2) {
                    case "abc":  if("techtorial".length()>5){
                        System.out.println("the name has more than 5 letter");

                    }
//                    case "Anna":
//                        System.out.println("You are speaking with " + name2);break;
//                    case "Maks":
//                        System.out.println("You are speaking with " + name2);break;
//                    case "Mike":
//                        System.out.println("You are speaking with " + name2);break;
//                    default:
//                        System.out.println("There is no such a person like: "+name2);break;
                }
                break;
            case 4:
                System.out.println("You reached out to Help Desk department.You are speaking with Efe");
                        break;
                    default:
                        System.out.println("There is no matching department for your entry ");
                }
        }
    }
