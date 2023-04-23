package com.java.arraylist;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        //create an arraylist and store 6 car brands
        //print out brand of every car from the list one at a time
        //[a,b,c,d,e,f]

        //a@yahoo.com
        //b@yahoo.com


        ArrayList<String> list = new ArrayList();
        list.add("Nissan");
        list.add("BMW");
        list.add("Kia");
        list.add("Chevy");
        list.add("Toyota");
        list.add("Mers");
        System.out.println(list);

       for(String car : list) {
           System.out.println(car + "@yahoo.com");
       }
       System.out.println("=======================");
       for(int i=0; i< list.size(); i++){
           System.out.println(list.get(i)+"@gmail.com");

    }
        System.out.println("***********************");
       filter(list);
    }
    //create a method that will take an arraylist as parameter
    //parameter arraylist should hold String type elements
    //that method will show only elements which have letter 'a' in it

    public static void filter(ArrayList<String> list1){

        for(int i=0; i< list1.size(); i++){
            if(list1.get(i).contains("a")){
                System.out.println(list1.get(i));
            }

        }

    }
}
