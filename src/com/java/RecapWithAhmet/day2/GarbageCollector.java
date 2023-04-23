package com.java.RecapWithAhmet.day2;

public class GarbageCollector {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        System.gc();

    }
}
