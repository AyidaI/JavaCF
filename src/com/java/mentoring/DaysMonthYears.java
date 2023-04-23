package com.java.mentoring;

public class DaysMonthYears {
    public static void getDMY(int m) {

  int days;
  int years;
int months;

    years = m/365;
    m=m%365;
        System.out.println("No of years: "+years);
        months=m/30;
        m=m/30;
        System.out.println("No. of months: "+months);
        days=m;
        System.out.println("No of days: "+days);

    }


}
