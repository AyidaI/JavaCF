package com.java.interviewQuestion.BeknazarTechlead;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {


        int[] arrNum = {1, 2, 3, 4, 5};

        //we will use two pointers. One pointer will start from the beginning
        //another one from the back and we will swap their values

        //pointer that will start from the back
        int j = arrNum.length - 1;

        //our loop will go till half of our input array
        //'i' is a pointer that will start from the beginning
        for (int i = 0; i < arrNum.length / 2; i++) {

            //swap elements using positions of i and (j-i)
            int temp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = temp;


            System.out.println(Arrays.toString(arrNum));
        }
    }
}
//Time complexity: O(n/2) but basically we can say O(n)
//Array works with references(same objects) so if we will modify argument
//it will have effect on an original array