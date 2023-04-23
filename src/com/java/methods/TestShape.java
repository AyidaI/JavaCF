package com.java.methods;

public class TestShape {
    public static void main(String[] args) {
        //create object
        Shape shape1 = new Shape();

        shape1.perimeterCalculator(5,10);
        shape1.perimeterCalculator(12,20);
        System.out.println("==========");

        shape1.triangleCalculator(2,5);
        shape1.triangleCalculator(5.5,2.2);

        Shape a =new Shape();
        a.perimeterCalculator(2,4);




    }
}
