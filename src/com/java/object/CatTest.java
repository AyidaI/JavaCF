package com.java.object;

public class CatTest {
    public static void main(String[] args) {
        Cat tom=new Cat();
        System.out.println(tom.name);
        tom.name="Tom";
        tom.age=3;
        tom.color="Black";

        System.out.println(tom.foodAmount);   //20

        tom.foodAmount=40;
        System.out.println(tom.foodAmount);

        tom.sleep();
        //methods with void return types cannot be called in sout
        //System.out.println(tom.sleep());

        Cat cat2=new Cat();
        cat2.sleep();   //null is sleeping

        tom.run();   //Tom is running

        int num= tom.run();
        System.out.println(num); //3
        System.out.println("============");
        System.out.println(tom.run());
        System.out.println("=============");

//however many miles tom runs, give him 500 dollar per mile
        System.out.println(tom.run()*500);
        System.out.println("===================");

        String message1=tom.walk(" west");
        System.out.println(message1);

        System.out.println(tom.walk(" up"));


        tom.setColor("Blue");
        System.out.println(tom.color);//blue

        System.out.println(cat2.color);//null

       String colorTom = tom.getColor();
        System.out.println(colorTom);
        System.out.println("===========");
        System.out.println(tom.color);
        System.out.println(tom.getColor());

        tom.allInfo();  //Tom-Blue-3-40
        System.out.println("++++++++++++++");

        String info=tom.allInfo();  //Tom-Blue-3-40
        System.out.println(info); //Tom-Blue-3-40**********

        tom.setAgeAge(12);
        tom.getAge();

        System.out.println("In 10 years your age will be "+(tom.getAge()+10));


    }
}
