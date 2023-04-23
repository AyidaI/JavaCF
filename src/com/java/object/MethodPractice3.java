package com.java.object;

public class MethodPractice3 {
    //create aa method that will take an array with some names of veggies
    //this method will generate a message for each veggie as
    //if the veggie name has word green in to it "this is my most favorite"
    //if the veggie name has not word green in to "This is my least favorite"
    //return count of either favorite or non-favorite veggie amount
    //make the method static
    // test your method in another class

    public static int veggieFilter(String[] veggies) {
        int counter = 0;
        for (String name : veggies) {
            name = name.toLowerCase();

            if (name.contains("green")) {
                counter++;
                System.out.println("This is my most favorite");
            } else {

                System.out.println("This is my least favorite");
            }
        }
        return counter;
    }
    //overload above veggieFilter method to create email address for each veggie
    //return those created email addresses as an array

    public static String[] veggieFilter(String[] veggies, int number){
        String[] emails = new String[veggies.length];
        int index=0;
        for(String name : veggies){
            String email=name +"@gmail.com";
            emails[index]=email;
            index++;

        }
        return emails;
    }
}
