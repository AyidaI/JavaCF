package com.java.mapPractice;

import java.util.HashMap;
import java.util.HashSet;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String, String> map=new HashMap<>();
        System.out.println(map);  //{}  --> object
        System.out.println("++++++++++");

        map.put("Alex","Smith");
        map.put("David", "Brown");
        map.put("Mary", "White");

        System.out.println(map);      //{Alex=Smith, David=Brown, Mary=White}
        System.out.println( map.get("David"));// Brown

        String valueDavid= map.get("David");
        System.out.println(valueDavid);//Brown


    }
}
