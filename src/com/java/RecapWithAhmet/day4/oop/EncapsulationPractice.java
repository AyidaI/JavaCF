package com.java.RecapWithAhmet.day4.oop;
/*
POSSIBLE INTERVIEW QUESTIONS:

1 - What is Encapsulation? Why do you use it?

--> Encapsulation is a way to protect/hide/restrict(limit) data from other users/classes.
--> We use "PRIVATE" keyword to make the data encapsulated
--> It is a way to make your data not accessible and manipulable by anyone
--> It is a way of restriction the data from the users/classes
--> It is a way to limit the users to reach out the class data
--> It is a way to hide from classes/users
--> It is a way to protect your data from other classes/users

2 - How can you access the data from encapsulation??

--> To be able to access these all data which are private, we use "getter" and "setter"

3 - If encapsulation is hiding the data from users/other classes and with getters and setters
you can still access it. What is the point of using encapsulation?

--> Actually, you can access the data from users/other classes and with getter and setter
 But they can not access your implementation inside of the method. It means you are still protecting your data
 based on your conditions. If you want me give an example SIR/MADAM i can say i have book and this book has 300 pages
(0 - 300) I would like to access the specific pages of book. Whenever I search for more than 300 or less than 0,
this website should give me an error and say that the page is not found. It means I manipulate/break their codes.
What people do that limit the users to access/hide/protect their data with a specific condition.

Summary: I know you can still access with getters and setters, but you can not access inside of the code(implementation)
which limits you.

 -->
*/
public class EncapsulationPractice {

   private String name="Ahmet";
    int age=31;
   private long creditCard = 123444565;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 || age<99){
            this.age = age;
        }else{
            System.out.println("Age is not in correct range ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // if()
        this.name = name;
    }


    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}
