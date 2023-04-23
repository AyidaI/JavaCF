package com.java.arrays;

import java.util.Arrays;

public class MultiDimensionPractice2 {
    public static void main(String[] args) {

        String[][] citiesFromStates = {{"Los Angeles", "Sacramento" },{ "Chicago", "SpringField", "Des Plaines"},
                {"Baltimor","Rockville"} };

        //use for-each loop to show names of cities
        //print -> when you find chicago-> "Chicago is in IL"
        LABEL:
        for(String[] city : citiesFromStates){
            for(String name : city){

           // System.out.print(name+", "); //Los Angeles, Sacramento, Chicago, SpringField, Des Plaines, Baltimor, Rockville,

                if(name.equalsIgnoreCase("Chicago")){
                    System.out.println(name + " is in IL");  // Los Angeles, Sacramento, Chicago, Chicago is in IL
                   // break LABEL;
                }else{
                    System.out.print(name+" ");  //Los Angeles Sacramento Chicago is in IL
                                                    //SpringField Des Plaines Baltimor Rockville
                }

        }}
    }
}
