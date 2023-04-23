package com.java.loops.whileLoop;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        String str = "television";

        int num=0;

        while(num <= str.length()-1){
//            System.out.print(str.charAt(num)+"-");
//            num++;

            if(num != str.length()-1){
                System.out.print(str.charAt(num)+"-");
            }else{
                System.out.print(str.charAt(num));
            }
            num++;
        }

    }
}
