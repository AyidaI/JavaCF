package com.java.Rahul;

import java.util.ArrayList;

public class StreamTest1 {

    public void regular(){
        ArrayList<String> names =new ArrayList<>();
        names.add("Don");
        names.add("Ahmet");
        names.add("Alex");
        names.add("Bob");
        names.add("Ram");
        int count=0;

        for (int i = 0; i <names.size() ; i++) {
            String actual = names.get(i);
            if(actual.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);

    }
}
