package com.java.object;

public class Shape {
    //calculate perimeter of rectangle
   // width, length 2*(w+l)
   // p=2*(w+l)
    public void perimeterCalculator(int width, int length){
        int perimeter = 2 * (width + length);
        System.out.println("The perimeter of rectangle is: "+perimeter);

    }
    //create a method that will calculate area of a triangle
    //A=
    public void areaCalculator(double base, double height){
        double area = (base * height)/2;
        System.out.println(area+ " is the area of triangle");

    }
}
