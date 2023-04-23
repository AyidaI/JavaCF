package com.java.methods;

public class Shape {

    //calculate perimeter of rectangle
    //width,length 2*(w+l)

//    int w=5, l=10, p=0;
//    p=2*(w+l);

    public void perimeterCalculator(int width, int length){
    int perimeter =2*(width+length);
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
    //create a method that will calculate area of a triangle
    //A=(b*h)/2
    public void triangleCalculator(double base, double height){
       double triangle=(base * height)/2;

        System.out.println("The triangle is: "+triangle);
    }


}
