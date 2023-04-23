package com.java.mapPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map=new HashMap<>();

        map.put(10, "Alex");
        map.put(20, "Sam");
        map.put(30, "Tom");
        System.out.println(map);  //{20=Sam, 10=Alex, 30=Tom}

        map.get(30);  //Tom
       System.out.println(map.get(30));
//example
//       int a=9;
//        System.out.println(a);

        map.put(20, "Vitaly"); //if the key is existing on the map, the value will be reassigned
        System.out.println(map);

        map.put(40, "Natalie");
        map.put(60, "Natalie");
        map.put(70, "Natalie");
        System.out.println(map);

        //how to reach out all values individually?
        //{20=Vitaly, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        System.out.println(map.get(10));  //Alex
        System.out.println(map.get(20));   //Vitaly

        //how can I have all keys on hand?
        //keySet()--> it will return all k=eys from the map

       Set<Integer> keys= map.keySet();
        System.out.println(keys); //[20, 70, 40, 10, 60, 30]
        System.out.println("===================");
//Ex1
        for(Integer key  : keys  ){
            map.get(key);
            System.out.println(map.get(key));

        }
        System.out.println("===================");
        //EX2
        for(Integer item : map.keySet()){
            System.out.println(" + "+map.get(item));
            /* output:
            + Vitaly
 + Natalie
 + Natalie
 + Alex
 + Natalie
 + Tom
             */
        }
        // reach out value
        //values() method

       Collection<String> values= map.values();// Collection can be any type
        System.out.println(values);  //[Vitaly, Natalie, Natalie, Alex, Natalie, Tom]

        for(String value : values){
            System.out.println("*"+value+"*");
//            o/P *Vitaly*
//*Natalie*
//*Natalie*
//*Alex*
//*Natalie*
//*Tom*
       }
        //replace()
        map.replace(40, "XXXXXX");
        System.out.println(map);

        map.replace(70, "Natalie", "Jenny");
            System.out.println(map); // {20=Vitaly, 70=Jenny, 40=XXXXXX, 10=Alex, 60=Natalie, 30=Tom}

        //map has size --> size()

        map.size();
        System.out.println(map.size());   //7

        //containsKey()
        System.out.println(map.containsKey("Mustafa")); //false

        //containsValue
        System.out.println(map.containsValue("1000"));    //false
        System.out.println(map.containsValue("Tom")); //true

        //isEmpty
        System.out.println(map.isEmpty());

        //clear()
        map.clear();
        System.out.println(map.isEmpty());
    }

    }

