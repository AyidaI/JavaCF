package com.java.mentoring;

import java.util.ArrayList;

public class List_Reorder {
    public static ArrayList<Integer> reorder(ArrayList<Integer> list) {
        ArrayList<Integer> output = new ArrayList<>();
        output.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            output.add(list.get(list.size() - i));
        }
        return output;
    }// 1,2,3,4,5           1,5 , 4, 3,2

//    ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        System.out.println(reorder(list));

//    ArrayList<Integer> list2=new ArrayList<>();
//        list2.add(322);
//        list2.add(892);
//        list2.add(327892);
//        list2.add(35622);
//        list2.add(2341);
//        list2.add(1);
//        System.out.println(reorder(list2));
}


