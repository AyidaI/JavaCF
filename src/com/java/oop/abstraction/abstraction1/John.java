package com.java.oop.abstraction.abstraction1;

public class John extends SelfLearner{

    public John(String name, int id){
        super(name, id);
    }
    @Override
    public void watchVideo(){
        System.out.println("John is on YouTubesyu ");
    }
    public int test1(){
        System.out.println("John is taking test");
        return 2;
    }
}
