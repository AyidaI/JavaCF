package com.java.interviewQuestion.BeknazarTechlead;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2023, Month.FEBRUARY, 6);
        System.out.println(date);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMM, YYYY");
        String strDate = f.format(date);
        System.out.println(strDate);  //06 Feb, 2023

        f=DateTimeFormatter.ofPattern("MM/dd/YYYY");
        strDate = f.format(date);
        System.out.println(strDate);  //02/06/2023
    }
}
