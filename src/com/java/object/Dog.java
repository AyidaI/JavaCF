package com.java.object;

public class Dog {

    //instance variables define object
    String name;
    int age;
    String breed = "husky";

    public String speak(int numberOfWords){


        return "Here are the words "+ numberOfWords;
    }
    public void feed(String foodType, int foodAmount){

        if(foodType.equalsIgnoreCase("x")){
            double num=.50 * foodAmount;
        }else{
            double nym=.10*foodAmount;
        }
        System.out.println("Dog is getting food");

    }
    public void setAge(int age1){
        age=age1;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="sharik"; //initiolazing
    }
}
