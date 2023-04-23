package com.java.RecapWithAhmet.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecapOfRecap {
      /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is the difference between Array and ArrayList?
    -->What is ....?
    -->What is the purpose of usage?
    -->Where do we use it?
    -->How do we use it?

     -->Array:Is a storage for Primitives and Objects.
     -->The purpose of usage:We can store the data temporarily
     and use it for different purposes.(It is a simple way of storing
     multiple data at the time)

     ArrayList:                                Array:
     1-Dynamic size                           1-Fixed size
     2-Storage for Only OBJECT                2-Primitives and Object
     3-It doesn't have multidimensional form  3-It does have Multidimensional form
     4-It has some good methods(add,get,size) 4-It doesn't have methods but function(length)
     5-ArrayList can be manipulable           5-it is not manipulate because there is no method
     6-Synthax is different                   6-Synthax is different
     */

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=1; // example of storing primitive into array
        numbers[1]=2;

        String[] names={"Ahmed", "Mehmet", "Mahmut"};  // ex: of storing object into array
        int[] numbers2 ={1,2};
        System.out.println(numbers); //not visible --> [I@75bd9247
        System.out.println(Arrays.toString(numbers2));  //[1, 2]

        List mix =new ArrayList();
        mix.add(numbers2[0]); //this is an example of storing Only Object

        //numbers2[0] --> no methods it means this is primiitive
       // mix.get(0).--> it stores only object

   //     String.valueOf(numbers2[1]).replace('2','5');
     //   System.out.println(Arrays.toString(numbers2));



/*
==>Write an implementation that initiliaze int array and find the:
  1-Sum of the even number
  2-SUm of the odd number
  3-Difference between them (the answer shouldn't minus)
  exp: {1,2,3,8,12,65,76,5,22,17} for each:
 */
        System.out.println("++++++++++++++==========");
        int[] nums= {1,2,3,8,12,65,76,5,22,17};
        int sumEven=0;
        int sumOdd=0;

        for(int num : nums){
        if(num % 2 ==0){
            sumEven+=num;
        }else{
                sumOdd+=num;
       // num%2==0 ? sumEven+=num : sumOdd +=num;
        }}
            System.out.println(sumEven);
            System.out.println(sumOdd);
            System.out.println(sumEven>=sumOdd ? sumEven-sumOdd : sumOdd-sumEven);
        }

    }

