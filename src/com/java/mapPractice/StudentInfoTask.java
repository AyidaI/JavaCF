package com.java.mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfoTask {
    /*
    FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago

FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: LakeForest

FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka

FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago

Store students info in to maps
store those student info into List
from list of students, find out city of the student
if student lives out of Chicago--> "You can join Online"
     */


    public static void main(String[] args) {

        HashMap<String, String> student1=new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");
/*
FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: LakeForest
 */
        HashMap<String, String> student2=new HashMap();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "LakeForest");

/*
FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka
 */
        HashMap<String, String> student3=new HashMap();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        /*
        FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
         */
        HashMap<String, String> student4=new HashMap();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List<HashMap<String, String>> listOfStudents=new ArrayList<>();
        listOfStudents.add(student1);  listOfStudents.add(student2);
        listOfStudents.add(student3);listOfStudents.add(student4);

        System.out.println(listOfStudents);


        //from list of students, find out city of the student
        //if student lives out of Chicago--> "You can join Online"

        for(HashMap<String, String> student  : listOfStudents){
            if(!student.get("City").equalsIgnoreCase("Chicago")){
                System.out.println(student.get("FirstName")+ " You can join Online");
            }
        }
//for loop with index number
        for(int i=0; i<listOfStudents.size(); i++){
            if(!listOfStudents.get(i).get("City").equalsIgnoreCase("Chicago")){
                System.out.println(listOfStudents.get(i).get("FirstName")+ " ** You can join Online **");
            }

        }
       // fullNameFinder(listOfStudents);
        //return of  fullNameFinder(listOfStudents);
        List<List<String>> result1=  fullNameFinder(listOfStudents);
     //   HashMap<String, List> result2 =  fullNameFinder1 (listOfStudents);
      //  fullNameFinder1(listOfStudents);  //call method
        //return of  fullNameFinder1
        HashMap<String, List> result3 =  fullNameFinder2 (listOfStudents);

      for(Object city : result3.get("Cities")) {
        //  System.out.println(list);
          if (city.toString().equalsIgnoreCase("Winnetka")){
              System.out.println("You are lucky since your are in "+ city);
          }

          //    cityName3(listOfStudents);

      }
    }

    //create a method
    //pass a parameter as list  --> List<HashMap<String, String>> listOfStudents
    //return all student firstNames and LastNames as a List

    public static List<List<String>> fullNameFinder(List<HashMap<String, String>> list){
        List firstName = new ArrayList();
        List lastName = new ArrayList();
        List<List<String>> fullNames=new ArrayList<>();

        for(HashMap<String, String> student  : list){
            firstName.add(student.get("FirstName"));
            lastName.add(student.get("LastName"));

        }
        fullNames.add(firstName);
        fullNames.add(lastName);
        System.out.println(fullNames); //[[David, Jeremiah, Michael, Sarah], [Pena, Michaelson, White, Star]]
        return fullNames;

    }

    public static HashMap<String, List> fullNameFinder1(List<HashMap<String, String>> list){
        List firstName = new ArrayList();
        List lastName = new ArrayList();

        HashMap<String, List> map1=new HashMap<>();

        for(HashMap<String, String> student  : list){
            firstName.add(student.get("FirstName"));
            lastName.add(student.get("LastName"));

        }
      map1.put("FirstNames", firstName);
       map1.put("LastNames",lastName);
        System.out.println(map1); //{LastNames=[Pena, Michaelson, White, Star], FirstNames=[David, Jeremiah, Michael, Sarah]}
        return map1;

    }

    public static HashMap<String, List> fullNameFinder2(List<HashMap<String, String>> list){
        List firstName = new ArrayList();
        List lastName = new ArrayList();

        List city = new ArrayList<>();
//create another list for cities
        HashMap<String, List> map2=new HashMap<>();

        for(HashMap<String, String> student  : list){
            //find and add cities to the list you created
            city.add(student.get("Cities"));

            firstName.add(student.get("FirstName"));
            lastName.add(student.get("LastName"));
        }
        //add your city list to the map
        map2.put("Cities", city);
        map2.put("FirstNames", firstName);
      map2.put("LastNames",lastName);

        System.out.println(map2); //{City=[Chicago, LakeForest, Winnetka, Chicago]}
        return map2;

    }
}
