package com.java.loops.forLoop;

public class NestedLoopPractice3 {

    public static void main(String[] args) {
        /*
        print out following for the years of 2020, 2021, 2022

        2020 -->1,2,3,..12  --> 1-Jan  2-Feb 3-March
        2021 -->1,2,3,..12  --> 1-Jan  2-Feb 3-March
        2022 -->1,2,3,..12  --> 1-Jan  2-Feb 3-March
         */



        for(int year=2020; year<=2022; year++){
            System.out.print(year+"-->");
            for(int month=1; month<=12; month++) {

                switch (month){
                    case 1: System.out.print(month+"-Jan ");
                    for(int day=1; day<=30; day++) System.out.print(day+" * ");
                    break;
                    case 2: System.out.print(month+"-Feb ");
                        for(int day=1; day<=30; day++) System.out.print(day+" * ");
                    break;
                    case 3: System.out.print(month+"-March "); break;
                    case 4: System.out.print(month+"-April ");break;
                    case 5: System.out.print(month+"-May "); break;
                    case 6: System.out.print(month+"-June "); break;
                    case 7: System.out.print(month+"-June ");break;
                    case 8: System.out.print(month+"-August "); break;
                    case 9: System.out.print(month+"-Sept "); break;
                    case 10: System.out.print(month+"-Oct ");break;
                    case 11: System.out.print(month+"-Nov "); break;
                    case 12: System.out.print(month+"-Dec "); break;

                }
            }
            System.out.println();
                }
        }
    }

