package com.java.arraylist;

import java.util.ArrayList;
/*
4. Create test case:
store 4 computer objects an AL
show properties of each computer from list
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();

        Computer c1 = new Computer("Dell", 1610, "Black", 15.5);
        Computer c2 = new Computer("Acer", 899, "Gray", 13.5);
        Computer c3 = new Computer("Apple", 1500, "White", 11.5);
        Computer c4 = new Computer("Asus", 300, "Silver", 17.5);

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);

        System.out.println(computers);
        System.out.println("======================");

        System.out.println(findFancyComputer(computers));

        System.out.println(totalCostOfComputer((computers)));

        //find computers they are less than $1000
        //and show their brand, cost and color to the user

        for(int i=0; i< computers.size(); i++){

            if(computers.get(i).price < 100){
                System.out.println(computers.get(i).brand+" - "+computers.get(i).price+" - "+computers.get(i).color);

            }
        }
    }
    //create a method that will get an AL as parameter
    //this method will find out computers that has price more than $1200
    //and screenSize is more than 13.5
   // this method will store and return those computers as a new AL

    public static ArrayList<Computer> findFancyComputer(ArrayList<Computer> devices) {

    ArrayList<Computer> fancyComputers = new ArrayList<>();
        //reach out
//        for (int i = 0; i < devices.size(); i++) {
//            //filter /check
//            if (devices.get(i).price > 1200 && devices.get(i).screenSize > 13.5) {
//                fancyComputers.add(i);
//            }
//                System.out.println(devices.get(i));


        for(Computer devvice : devices){
            if(devvice.price>1200 && devvice.screenSize>11.5){
                fancyComputers.add(devvice);
            }
            }
        return fancyComputers;
        }
        //find out and tell me the total prices of computers so that I can buy all of them
    //create a method to solve this task

    public static Double totalCostOfComputer(ArrayList<Computer> list){
        double sum=0;

        for(Computer item : list ){
            sum+=item.price;
        }
        return sum;
    }

    }

