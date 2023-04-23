package com.java;

public class ReversingStringPalindrome {
    public static void main(String[] args) {

        /*
        check if giving string is palindrome or not
        EFE, yay, kayak
         */

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter word");
//        String word=scanner.nextLine();

        String word= "moon";
        String reverse="";

        for(int i=word.length()-1; i>=0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)) {
            System.out.println(reverse+" - It is Palindrome");
        }else{
            System.out.println(reverse+ "- Not Palindrome");
        }
        }
    }

