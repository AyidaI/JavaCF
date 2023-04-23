package com.java.string;

public class StringMethods3 {
    public static void main(String[] args) {
        //contains()  --> boolean

        String str = "water";

        boolean b=str.contains("w");
        boolean b2 =str.contains("ter");
        System.out.println(b);
        System.out.println(b2);

        System.out.println(str.startsWith("wat")  != str.contains("ter")); //true != true --> false
        System.out.println(str.startsWith("wat")  != str.contains("ter") && false);  //false
        System.out.println(str.startsWith("wat")  != str.contains("ter") && true);   //false

        //equals() --> boolean
        str+=str.toUpperCase();
       System.out.println(str.toUpperCase());  //WATERWATER
        System.out.println(str.equals("WATER"));

        System.out.println("============");

        String day=" Monday";
        String season = "Winter";

        System.out.println(day.equalsIgnoreCase("Monday"));
        System.out.println("===========");

        String task="Lets do it";
        //task and print out the word 'do'
        System.out.println(task.substring(5,7));  //do
        System.out.println(task.length());  //10

        System.out.println("========Homework=========");

        //make solution dynamic
        String task2= "Welcome to Java class";
        int firstSpaceIndex = task2.indexOf(' ');
        int secondSpaceIndex=task2.indexOf(' ',firstSpaceIndex+1);
        System.out.println(firstSpaceIndex);  //7
        System.out.println(secondSpaceIndex);  //10
        String secondWordFromSentence = task2.substring(firstSpaceIndex+1, secondSpaceIndex);
        System.out.println(secondWordFromSentence); //to


        //or
        System.out.println(task2.substring(task2.indexOf(' ')+1, task2.indexOf(' ', firstSpaceIndex+1)));  //to


    }

}
