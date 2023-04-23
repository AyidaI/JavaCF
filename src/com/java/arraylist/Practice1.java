package com.java.arraylist;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(5);
        ArrayList list3 = new ArrayList(list1);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("Tomatoes");

        System.out.println(list);
        list.add("Cucumber");
        list.add("Potatoes");
        list.add("Cherries");
        list.add("Lettuce");

        System.out.println(list);
        System.out.println(list.get(4)); //Lettuce

       String item = list.get(3);
        System.out.println(item);  //Cherries

        list.add(3,"Bananas");
        System.out.println(list); //tomatoes, cucumber, potatoes, bananas, cherries, lettuce
        System.out.println(list.get(3)); //bananas

      //  list.add(9,"apples");  //IndexOutOfBoundsException
        list.add(6,"apples");
        System.out.println(list);  //tomatoes, cucumber, potatoes, bananas, cherries, lettuce, apples

        //add() an element, add() an element to a specific index, get()
        System.out.println("======================================");


        //size()
      int size = list.size();
        System.out.println(size);

        //set() ----> it will replace the element at given index
        list.set(4,"Dressing");
        System.out.println(list);

        //remove()
        list.remove(4);  //remove dressing
        System.out.println(list);
        System.out.println(list.size());

        list.remove("Bananas");
        System.out.println(list);

        System.out.println("+++++++++++++++++");

        list.clear();  //delete everything
        System.out.println(list);

        System.out.println(list.size()); //0

        System.out.println("=====================");

        ArrayList<String> list5=new ArrayList<>();
        list5.add("bread");
        list5.add("cheese");
        list5.add("mayo");

        list.addAll(list5);
        System.out.println(list);
        list.add("grape");
        System.out.println(list);







    }
}
