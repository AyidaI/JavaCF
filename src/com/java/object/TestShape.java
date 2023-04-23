package com.java.object;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.perimeterCalculator(5, 8);

        shape1.areaCalculator(5.5,2.2);

        Shape a = new Shape();
        a.areaCalculator(1,3);
    }
}
