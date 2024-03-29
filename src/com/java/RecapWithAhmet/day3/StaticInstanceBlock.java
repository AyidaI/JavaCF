package com.java.RecapWithAhmet.day3;

public class StaticInstanceBlock {
    /*
        POSSIBLE INTERVIEW QUESTIONS:

          1-What is static as a keyword and why do you use it ?

          -->Static(As a keyword) is a way to make the methods accessible
          "WITHOUT CREATING AND OBJECT" from that class.
          -->The disadvantage of using static keyword "YOU CANNOT OVERRIDE THE METHODS"
           SIDE NOTE:YOU CANNOT OVERRIDE "PRIVATE,STATIC,FINAL METHODS"

          2-What is static block?

          -->It is the block that can be called once (ONE TIME IT WORKS)
          -->It always executes FIRST

          3-What is static as a variable keyword?

          -->It makes the variable belong to the class
          -->It is sharable (common) ==> common for all objects
          -->It can be accessed by other classes without creating an object.Just with
          the name of class.

          4-What is instance block?

          -->It is a block that can be called as many as you have objects.

         */
    public static void main(String[] args) {
        StaticExample staticExample=new StaticExample();  //object 1
        staticExample.run();

        //To be able to call static method. I can use just
        // className(System suggested)
        StaticExample.speak();
  //      StaticExample.age=31;

        StaticExample ahmet=new StaticExample();  //object 2
        System.out.println(ahmet.money);  //10000
        ahmet.withdrawMoney();
        System.out.println(ahmet.money);  //9800

        StaticExample mehmet=new StaticExample();  //object 3
        mehmet.withdrawMoney();//9800--> 9600
        mehmet.withdrawMoney();//9600--> 9400
        System.out.println(mehmet.money); //9400

        //3 objects --> instance sout -->3
        //3 objects --> static sout -->1

    }
}
