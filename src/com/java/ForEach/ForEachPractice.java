package com.java.ForEach;

import java.util.Arrays;

public class ForEachPractice {
    public static void main(String[] args) {

        String[] flowers = {"rose", "daisy", "sunflowers"};
        for(String flower : flowers){
            System.out.println(flower.toUpperCase() );
        }
        String[] cities = {"Chicago", "Miami", "New York", "Tokyo", "Doha"};
        //chicago@gmail.com, maimi@gmail.com
        //put those e-mail address is another storage for future reference

        String [] cityEmails =new String[cities.length];
        int i=0;
        for(String city : cities){
          cityEmails[i] =  city.toLowerCase().replace(" ", "").concat("@gmail.com");
                System.out.println(city);
                i++;
            }
        System.out.println(Arrays.toString(cityEmails));  //[chicago@gmail.com, miami@gmail.com, newyork@gmail.com, tokyo@gmail.com, doha@gmail.com]
        }
    }

