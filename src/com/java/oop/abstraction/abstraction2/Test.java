package com.java.oop.abstraction.abstraction2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //you cannot create an object from interface
      //  CanSwim canSwim=new CanSwim();

        Bird bird = new Bird();
        bird.eat();

        System.out.println(bird.TAIL);
        System.out.println(CanFly.WING);

        Dolphin dolphin = new Dolphin();
        dolphin.swim(3);
        System.out.println(dolphin.FIN);
        System.out.println(CanSwim.FIN);

        //is there any other way that I can still create a Dolphin object
      //  List list =new ArrayList();  not have to create List

        CanSwim dolphin2 = new Dolphin();
        dolphin2.swim(4);

        Duck duck=new Duck();
        duck.fly();
        duck.landing(50);
        duck.swim(4);
        //is there any other way that i can still create a Duck object

        CanFly duck1 = new Duck();
        CanSwim duck2 = new Duck();

        duck1.fly();
        duck2.swim(5);

        System.out.println("===============");
        Duck duck3=new Duck();
        duck3.run();

        duck3.printInfo();


    }
}
