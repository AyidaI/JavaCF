package com.java.setPractice;

import java.util.HashSet;
import java.util.Set;

public class Task {

    //create a method that will take String Array as parameter, and it will return value as a set collection



    public static Set<String> convertArrayToSet(String[] data){
        Set<String> set = new HashSet<>();

        for(String item : data ){
            set.add(item);
        }
        return set;
    }

    public static void main(String[] args) {
        String[] array={"microphone","phone", "clock", "timer", "cup", "microphone", "clock"};
        System.out.println(convertArrayToSet(array));

        Set<String> abc = convertArrayToSet(array);

    }
}
