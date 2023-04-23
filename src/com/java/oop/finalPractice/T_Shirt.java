package com.java.oop.finalPractice;

public final  class T_Shirt extends Shirt{

   public void sale(){

        System.out.println("T-Shirt Sale");
}
//final method from parent cannot be overridden
//    public void dye() {
//        System.out.println("Changing color of ======");

    public static void main(String[] args){
       Shirt shirt=new Shirt();
       shirt.dye();
       shirt.dye("Red");

       Shirt shirt1=new Shirt();
        Shirt shirt2=new Shirt();
        Shirt shirt3=new Shirt();

        shirt1=null;
        shirt2=null;
        System.gc();

        }
    }
