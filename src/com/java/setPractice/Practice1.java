package com.java.setPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        HashSet<String> set2 = new HashSet();
        HashSet<Integer> set3 = new HashSet<>();
      Set<String> set4 = new HashSet();

        System.out.println(set2);//  empty []

        set2.add("Alex");
        set2.add("Vitaly");
        set2.add("Sam");
        set2.add("Anna");
        System.out.println(set2);//[Alex, Vitaly, Sam, Anna]
        set2.add("Alex");
        set2.add("Vitaly");
        System.out.println(set2);//[Alex, Vitaly, Sam, Anna] no duplicate


        //null
        set2.add(null);
        System.out.println("Added first null--->"+set2); //[null, Alex, Vitaly, Sam, Anna]
        System.out.println("**************");
        //show all elements one by one
        //if the name is Alex, Say "Hello" to him
        for(String name : set2){
            if(name != null && name.equalsIgnoreCase("Alex")) {
                System.out.println("Hello");
                //  System.out.println(name);
            }
        }
        Boolean result1 = set2.contains("Alex");
        System.out.println(result1); //true

        System.out.println(set2.isEmpty());  //false

        set2.clear();
        System.out.println(set2);

//        String[] strs = {"a","b","a",};
//        HashSet<String[]> set6 = new HashSet();
//        set6.add(strs);
//        System.out.println(set6);  //[[Ljava.lang.String;@75bd9247]

        HashSet<String> test = new HashSet<>();
        test.add("Denver");
        test.add("Springfield");
        test.add("La");
        test.add("Columbus");
        filter(test);


    }
    //create a method that will a set param
    //this method will filter String elements based on their length
    //length 5 or more will have stars next to it others will have ? next to it

    public static void filter(HashSet<String> data){
        for(String item : data){
            if(item.length()>=5){
                System.out.println(item+ " ******");
            }else{
                System.out.println(item+ " ?????");
            }
        }
    }
}
