package com.java.RecapWithAhmet.day5;

public interface InterfacePractice2 {

     default void run(){  //Show OFF
        System.out.println("sddd");
    }
   public abstract void dismiss();  //already default not have to put public abstract

    void speakWithAhmet();
}
