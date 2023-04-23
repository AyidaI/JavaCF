package com.java.AlgorithmsDataStructuresHolczer.collection;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        //resizing the array takes 0(N)
        List<String> names = new java.util.ArrayList<>();
        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        //random indexing in 0(1)
        System.out.println(names.get(0));
        //insert item into a given index 0(N)
        names.add(0,"Daniel");
        names.remove(0);

        //contains will check whether the item is present in the array 0(N)
        System.out.println(names.contains("Katy"));//false

       Object[] o= names.toArray();

        //ArrayList (Arrays) ARE FAST IF WE MANIPULATE THE LAST ITEM

        //because of the Iterable interface
        for(String s : names){
            System.out.println(s);
        }
    }
}
