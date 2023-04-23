package com.java.mapPractice;

import java.util.HashMap;

public class EmployeeTest {
    /*
    create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids as KEY
-create a method to print only employee names from map
     */
    public static void main(String[] args) {

        //-create 4 employee object and store them in a map
        Employee e1=new Employee("Emma", "Chicago", 30);
        Employee e2=new Employee("Alex", "Des Plaines", 24);
        Employee e3=new Employee("Sam", "Chicago", 35);
        Employee e4=new Employee("David", "Zion", 40);

        //-while storing employees in the map, use their ids as KEY
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);

        System.out.println(employeeMap);
        nameFinder(employeeMap);


    }
    //ccreate a method
    public static void nameFinder(HashMap<Integer, Employee> map){
        //print only employee names from map
        for(Employee employee  : map.values()){
            System.out.println(  employee.name);

        }

    }
}
