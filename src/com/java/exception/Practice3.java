package com.java.exception;

public class Practice3 {

        //create a method
        //this method have some implementation
        //there will be a type of exception in your logic
        //handle that exception with try-catch blocks

public static void practice() {

    try {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("I catch an axection");
    }finally {
        System.out.println("Finally Block");
    }
}



    public static void main(String[] args) {
        System.out.println("First line");
        practice();
        System.out.println("After method call");
    }}








//        public static void method1(){
//            try{
//                int a= 5;
//                String str=String.valueOf(a);
//                String str2=str.substring(6); //StringIndexOutOfBoundsException
//            }catch(StringIndexOutOfBoundsException e){
//                System.out.println("CATCH");
//            }
//        }
//
//        public static void main(String[] args) {
//            method1();
//        }




