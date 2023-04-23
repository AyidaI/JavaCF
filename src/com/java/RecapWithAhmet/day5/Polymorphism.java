package com.java.RecapWithAhmet.day5;

public class Polymorphism {


    public  void dismiss(int time, int minute , String nameOfTeacher){
        System.out.println("Student are leaving at "+time+minute+ " with teacher "+ nameOfTeacher);

    }
    public void dismiss(int hour, String nameOfTeacher){
        System.out.println("Student are leaving at "+hour+ " with teacher "+ nameOfTeacher);
    }
    public void dismiss(String date, int nameOfTeacher){
        System.out.println("Hello");
    }
}
