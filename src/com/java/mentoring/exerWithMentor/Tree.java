package com.java.mentoring.exerWithMentor;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//10
        String str="*";
        int n= scanner.nextInt();
        int a=n;
        String str2="";
        for (int i=0;i<n;i++){
            str2+=" ";
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<1;j++){
                System.out.print(str2.substring(0,a));
                a--;
            }
            System.out.println(str);
            str+="**";
        }
        a=n;
        for (int i=0;i<n/3;i++){
            System.out.print(str2.substring(0,a-1));
            System.out.println("| |");
        }
    }
}
