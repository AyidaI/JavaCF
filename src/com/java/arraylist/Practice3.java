package com.java.arraylist;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<Integer> zipCodes = new ArrayList();
        zipCodes.add(540);
        zipCodes.add(600);
        zipCodes.add(404);
        zipCodes.add(202);

        System.out.println(zipCodes);

        for (Integer code : zipCodes) {
            System.out.println(code + 10); //550, 610,414,212
        }
        System.out.println("================");
        for (Object code : zipCodes) {
            System.out.println(code); //540, 600, 404, 202
        }
        System.out.println("*************************");

        ArrayList list1 = new ArrayList();
        list1.add("Diana");
        list1.add(123);
        list1.add(true);

        System.out.println(list1.get(0).toString().toUpperCase());
        System.out.println(list1.get(1).toString().equals("123"));


        //contains
        System.out.println(zipCodes.contains(540)); // true

        Boolean b = zipCodes.isEmpty();
        System.out.println(b); //false

        list1.clear();
        System.out.println(list1.isEmpty());  //true

        System.out.println("==================");

        System.out.println(test2(zipCodes));   // [Hi540, Hi600, Hi404, Hi202]

        ArrayList<String> abcd = test2(zipCodes);
        System.out.println(abcd);// [Hi540, Hi600, Hi404, Hi202]  ---> print same message
    }
    //create a method that will take an ArrayList as param
    //it will generate message for each item from the list
    //it will store and return those messages as an ArrayList

public static ArrayList<String> test2(ArrayList<Integer> list){
        ArrayList<String>  messages = new ArrayList<>();
        for(Integer number  : list){
            messages.add( "Hi"+number);
        }
        return messages;

}}
