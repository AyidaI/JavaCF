package com.java.mentoring;

import java.util.ArrayList;
import java.util.List;

public class EmployeePractice {
    public static void main(String[] args) {


    Employee emp1=new Employee(23, "Developer", 34555);
    Employee emp2=new Employee(34, "Developer", 56000);
    Employee emp3=new Employee(37, "Manager", 65000);

//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for(Employee e: employeeList){
            Employee.info(e);
            System.out.println();
        }
}}
