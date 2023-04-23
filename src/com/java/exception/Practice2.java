package com.java.exception;

public class Practice2 {
    public static void main(String[] args) {

        try{
        System.out.println( " FIRST ");
        String str = "b15";
            int result1 = 15/0; //ArithmeticException
        int number = Integer.parseInt(str); //NumberFormatException
        System.out.println(" SECOND ");
        int result = 15/0;

        System.out.println(" THIRD ");

        }catch(ArithmeticException e){
            System.out.println(" Catch");
        }catch(RuntimeException e1){
            System.out.println(" Catch2");
        }
        try {
            String str = "Last";
            String rev = "";
            for (int i = str.length(); i >= 0; i--) {  //StringIndexOutOfBoundsException
                rev += str.charAt(i);
            }
            System.out.println(rev);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }


        //String Reverse
//        String str = "Last";
//        String rev="";
//        for(int  i=str.length()-1; i>=0; i--){
//            rev+=str.charAt(i);
//        }
//        System.out.println(rev);
    }
}
