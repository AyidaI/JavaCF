package com.java.setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {

    List<String> list = new ArrayList<>();

        list.add("mac");
        list.add("Acer");
        list.add("mac");
        list.add("lenovo");
        list.add("mac");

        System.out.println(list);    //[mac, Acer, mac, lenovo, mac]
        System.out.println("===============");

        //find out repeating elements from the given list
        //use set in to your solution logic
        //hint--> using add()

        HashSet<String> set = new HashSet<>();
        ArrayList<String> duplicate = new ArrayList<>();

        for(String  item  : list){
            if (!set.add(item)){  //if-> going catch duplicates
                System.out.println(item);  // mac   mac
                duplicate.add(item);
            }
        }
        System.out.println(">> duplicate list:--> "+duplicate);  //>> duplicate list:--> [mac, mac]

}}

