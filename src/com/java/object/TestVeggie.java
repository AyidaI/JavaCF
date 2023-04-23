package com.java.object;

import java.util.Arrays;

public class TestVeggie {
    public static void main(String[] args) {
        String[] items ={"red tomatoes", "green tomatoes","green cucumber", "yellow onion"};

        int count = MethodPractice3.veggieFilter(items);
        System.out.println(count);
        MethodPractice3 object1=new MethodPractice3();
        object1.veggieFilter(items);

      String[] product=  MethodPractice3.veggieFilter(items,7);
        System.out.println(Arrays.toString(product));
    }
}
