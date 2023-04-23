package com.java.mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice6 {
    public static void main(String[] args) {
        HashMap<String, Integer> departments = new HashMap<>();
        departments.put("IT", 204);
        departments.put("HR", 305);
        departments.put("Admin", 102);

        //keySet()--> returning all keys at set
        //values()---> returning all values as Collection

        System.out.println(departments.keySet());  //[HR, IT, Admin]
        System.out.println(departments.values());  //[305, 204, 102]
        System.out.println(departments);//{HR=305, IT=204, Admin=102}

        //entrySet() --> will return keys and values as pair
        departments.entrySet();
        System.out.println(departments.entrySet());  // [HR=305, IT=204, Admin=102]
        System.out.println("====================");

        Set <Map.Entry<String, Integer>> pairs = departments.entrySet();
        //reach out key-value pairs individually
        for(Map.Entry<String, Integer> pair : pairs){
       //     System.out.println(pair);
            /* out/put individually
           HR=305
            IT=204
            Admin=102
             */
            System.out.println("--->"+pair.getKey()); //-->HR
            System.out.println("--->"+pair.getValue()); //--->305
        }
    }
}
