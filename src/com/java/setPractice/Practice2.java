package com.java.setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {
        /*
        HashSet  --> No order, can sore null value
        LinkedHashSet ---> Insertion order, can store null value
        TreeSet ---> Ascending order, No null
         */
        HashSet<String> hash = new HashSet<>();
        LinkedHashSet<String> liked=new LinkedHashSet<>();
        TreeSet<String> tree=new TreeSet<>();

        hash.add("apple");          liked.add("apple");          tree.add("apple");
        hash.add("orange");         liked.add("orange");         tree.add("orange");
        hash.add("cherry");         liked.add("cherry");         tree.add("cherry");
        hash.add("strawberry");     liked.add("strawberry");     tree.add("strawberry");

        System.out.println(hash);       System.out.println(liked);    System.out.println(tree);
        System.out.println("=================");
        hash.add("null");     liked.add("null");    // tree.add("null");
        System.out.println(hash);       System.out.println(liked);    System.out.println(tree);
        System.out.println("*********************");


        //TreeSet methods
        System.out.println(tree.first());  //apple ---> finds first element from TreeSet
        System.out.println(tree.last());  //strawberry ---> finds last element from TreeSet
        System.out.println(tree.pollFirst());  //apple
        System.out.println(tree.pollLast());//strawberry
        System.out.println(tree); //[cherry, orange]---> starts from beginning value to end

        System.out.println(tree.descendingSet());  //[orange, cherry]  ---> starts from last value to beginning
        System.out.println("adding watermelon first time "+tree.add("watermelon"));  //true
        System.out.println(tree);

        System.out.println(hash.contains("x"));
        System.out.println("adding watermelon second  time "+tree.add("watermelon"));  //false





    }
}
