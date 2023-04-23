package com.java.allOtherPractices.exercises;

public class PrimeNum {
    public static void main(String[] args) {

        int num=13, count=0;


        for(int i=1; i<=num; i++){
            if(num%i==0) {
                count++;
            }}
                if(count==2){
                System.out.println("Prime num");
            }else{
            System.out.println("Not prime num");
        }}}

