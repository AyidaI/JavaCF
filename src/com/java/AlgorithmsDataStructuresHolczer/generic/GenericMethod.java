package com.java.AlgorithmsDataStructuresHolczer.generic;

public class GenericMethod {

    public <T, V> void printItems(T t, V v){
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    public <T> void showItem(T item){
        System.out.println("The item is: "+ item.toString());
        return;
       

    }
}
