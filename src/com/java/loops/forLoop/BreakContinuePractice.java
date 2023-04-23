package com.java.loops.forLoop;

public class BreakContinuePractice {
    public static void main(String[] args) {
//
//        for(int i=0; i<16; i++){
//            System.out.println(i);
//
//            if(i > 9) {
//
//                break;
//            }
//          }
//        System.out.println("==========");
            for(int i=0; i<16; i++){


                if(i >= 10 && i<=13){

                   continue;
                }
                System.out.println(i+"Bye");
        }
    }
}
