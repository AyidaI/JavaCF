package com.java.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("IL");
        list.add("OH");
        System.out.println(list.get(1));

        //convert from array to ArrayList

        int[] digits = {3,4,5,6};
     List<int[]>  a = Arrays.asList(digits);
  //   a.add(12);  //UnsupportedOperationException
        System.out.println(a); //[[I@7dc36524]

        System.out.println(Arrays.toString(a.get(0)));  //[3, 4, 5, 6]

        System.out.println(a.get(0)[0]);  //3
        System.out.println("=========================");

        //convert  ArrayList to array
        ArrayList items = new ArrayList();
        items.add("Alex");
        items.add("Anna");
        System.out.println(items);

        Object[] array=items.toArray();
        System.out.println(Arrays.toString(array));

        array[1]="Vitaly";
        System.out.println(Arrays.toString(array));

    }
}
