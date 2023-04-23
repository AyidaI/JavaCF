package com.java.oop.inheritance4;

public class Book {
   static int pageCount=101;
    String title;
    String kind;

    public int getPageCount() {

        return pageCount;
    }

    public Book(int pageCount, String title, String kind) {
        this.pageCount = pageCount;
        this.title = title;
        this.kind = kind;
    }
    public static void read(){
        System.out.println("Reading book");
    }
}
