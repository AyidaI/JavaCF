package com.java.loops.forLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        /*
        print out hrs and minutes as follows
        for the hrs from 1 to 12
        for the minutes from 0 to 59
        hour - 1:  min - 0
        hour - 1:  min - 1
        hour - 1:  min - 2
        -------
         hour - 2:  min - 0
        hour - 2:  min - 1
        hour - 2:  min - 2
         */
OUTER:
        for(int hour=1 ; hour< 12; hour++){

            INNER1:
            for(int min=0; min<=59; min++){

//              if( min==31){
//                  break OUTER;
//              }

                INNER2:
                for(int sec=0; sec<=60  ; sec++){

                    if(sec>20 && sec<40) {
                        continue OUTER;
                    }


                    if(hour <=6){

                System.out.println("hour -"+hour+": min-"+min+": sec-"+sec+ " AM");
            }else{
                        System.out.println("hour -"+hour+": min-"+min+": sec-"+sec+ " PM");
                    }
            System.out.println("=====");
        }}
    }
}}
