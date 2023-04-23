package com.java.oop.abstraction.abstraction1;

public class Test {
    public static void main(String[] args) {



    OnlineStudent onlineStudent=new OnlineStudent("Ben",2345);
    onlineStudent.watchViaZoom();
    onlineStudent.test1();

    //you cannot create an object from Abstract class
  //  Student student=new Student();

        Alia alia = new Alia("Alia",1112);
        System.out.println(alia.id);

        CampusStudent campusStudent=new CampusStudent("Efe",678);
        campusStudent.playTableTennis();
        campusStudent.test1();
        campusStudent.sleep();
    }}

