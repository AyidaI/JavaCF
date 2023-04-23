package com.java.RecapWithAhmet.day5;

public class Exceptions {
    public static void main(String[] args) throws InterruptedException {

        String nums = "$199";
        System.out.println(nums);


        try {
            int price = Integer.parseInt(nums);
            System.out.println(price);
        }catch (NumberFormatException e) {
            System.out.println("Your price parsing is not working");
              throw new NumberFormatException();
        }finally {
            System.out.println("I am finnaly block");
        }
        Thread.sleep(3000);
    }


}
