package com.java.arraylist;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        //create an arraylist to store 5 city names
       // implement a logic to print only city names that have 6 or more letters

        ArrayList<String> city=new ArrayList();


        city.add("Miami");
        city.add("Boston");
        city.add("Honolulu");
        city.add("New York");
        city.add("Zion");
        city.add("Dubai");

        System.out.println(city);

        for(String cities : city){
            if(cities.length()>=6){
                System.out.println(cities);
            }
        }
        System.out.println("====================");
        for(int i=0; i< city.size(); i++){
            if(city.get(i).length()>=6){
                System.out.println(city.get(i));
            }
        }
    }
}
