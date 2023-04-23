package com.java.RecapWithAhmet.day3;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    /*
          POSSIBLE INTERVIEW QUESTIONS:

          1-Can you tell me about map and why do you use map in your project?

          -->Map is an awesome interface to be used in my project to share/store my data
          as "KEY" AND "VALUE"

          2-What is the connection between Collection and Map?

          -->They are all useful that I use in my project for different purposes.

           As I mentioned before SET is all about uniqueness
                                 LIST is all about duplication if it is needed
                                 MAP is all about KEY and VALUE

           SHOW OFF : did you know that there is a good explanation for the connection that I realized
           When I was working on Map, I checked the feature of KEY  and feature of VALUE.

            --> Key acts like the Set Feature.it means it only accepts the Unique Data
            -->Value acts like the List Feature.It means it accepts duplicates as well.

          3-What is the type of Map and difference between them?

             --> To be honest, I didn't like the map at the beginning because it seemed so complicated
             but after I learned the beauty of sub-types which are:

                -->HashMap -->it stores randomly
                -->LinkedMap-->it stores insertion
                -->TreeMap-->is my favorite to do ascending order.
             //Schnucks -->Tally Simbe Robot
          4-Synchronization? can you give examples and what do you know about it usage in java?

            IN JAVA -->FIRST COME FIRST SERVE   --> IN AUTOMATION --> WAIT TIMES

          *-->It executes any actions one by one(one after another)
          **-->We have two most common concepts in java use Synchronization
               -->HASHTABLE  --> STRING BUFFER ***
         *** -->Synchronized system is ******THREAD-SAFE ******* and ********SLOWER***********

         *** --->Non-Synchronized system is ******** NOT THREAD-SAFE****** FASTER **************
               -->LIST,MAP,SET,STRING BUILDER

         */
    public synchronized void run(){
        System.out.println("Hello");
    }
    public void run2(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
//        Map<String, String> names =new HashMap<>();
//
//    }}
    /*
    HomeWork: By Tomorrow
    String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
TASK:I want you get the output of total item for each:
-->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
TIPS:You can use a method(map) containsKey
TIPS:If condition
     */


 String[]fruits ={"Apple","Banana","Peach","Apple","Orange",
        "Strawberry","Banana","Apple","Cherry","Orange"};
 Map<String, Integer> fruitCount = new HashMap<>();

        for (String fruit : fruits) {
                if (fruitCount.containsKey(fruit)) {
                fruitCount.put(fruit, fruitCount.get(fruit) + 1);
                } else {
                fruitCount.put(fruit, 1);
                }}
                System.out.println(fruitCount);

}}


