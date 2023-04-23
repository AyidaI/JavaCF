package com.java.mentoring.exerWithMentor;

import java.util.ArrayList;
//o/p [10, 70, 70, 20]
public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(120);
        list.add(10);
        list.add(70);
        list.add(70);
        list.add(20);
        list.add(1200);
        list.add(1290);
        System.out.println(removeGreateThan100(list));
    }
    public static ArrayList<Integer> removeGreateThan100(ArrayList<Integer>list){
        for(int i= list.size()-1; i>=0; i--){
            if(list.get(i)>100){
                list.remove(i);
            }
        }
        return list;
    }

}
