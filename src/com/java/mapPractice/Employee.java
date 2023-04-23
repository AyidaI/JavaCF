package com.java.mapPractice;

import java.util.Random;

public class Employee {
    /*
-create an employee class with instance variables of name, city, age, id
-create one constructor to initialize instance variables
-create a method to generate random  employee id and use this id for employee

-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids as KEY
-create a method to print only employee names from map
     */

    //-create an employee class with instance variables of name, city, age, id
    String name, city;
    Integer age, id;

    //-create one constructor to initialize instance variables
    public Employee(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    //-create a method to generate random  employee id and use this id for employee
    public Integer idGenerator(){
        Random random=new Random();
        return  random.nextInt(100000);

}
}
