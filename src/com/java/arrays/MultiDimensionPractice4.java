package com.java.arrays;

public class MultiDimensionPractice4 {
    public static void main(String[] args) {
        String[][] menu = { {"steak", "pasta", "fries" } , {"olivie", "cesar" } , {"ice cream", "cake", "candy", "pie" } };

        System.out.println( menu[2][1] );  //cake
        String sweet1 = menu[2][1];
        System.out.println(sweet1);   //cake

        System.out.println( menu[0][2] ); //fries

        for(int page =0 ; page< menu.length; page++){
            for(int item = 0; item<menu[page].length; item++){
                System.out.print(menu[page][item]+" ");  //steak pasta fries olivie cesar ice cream cake candy pie
                if( menu[page][item].equalsIgnoreCase("ice cream") ){

                    System.out.println("Kids want to get "+ menu[page][item] ); //teak pasta fries olivie cesar ice cream Kids want to get ice cream
                                                                                     //cake candy pie
                }
            }
        }

    }
}
