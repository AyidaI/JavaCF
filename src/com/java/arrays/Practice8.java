package com.java.arrays;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {

        String[] brands ={"Nike", "Adidas", "Puma", "New Balance", "Reebok"};
        //print every brand name in reverse version

        String[] reversedArray = new String[brands.length];

        for(int  i=0; i< brands.length;  i++) {

            String reverse="";
        for(int  k= brands[i].length()-1; k>=0; k--) {

            reverse += brands[i].charAt(k);
        }
        reversedArray[i]=reverse;
            System.out.println("Reversed of: "+brands[i]+ "-->"+reverse);

        }
        System.out.println(Arrays.toString(reversedArray));// [ekiN, sadidA, amuP, ecnalaB weN, kobeeR]

        }

    }

