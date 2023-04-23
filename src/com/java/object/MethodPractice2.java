package com.java.object;

public class MethodPractice2 {
    //create a method that will take two double numbers and an operation name
    //this method will return the result
    //*operation --> addition or multiplication
    public static void main(String[] args) {
        MethodPractice2 john=new MethodPractice2();
      double call1=  john.testMethod(3.2,1.8,"multiply");
        System.out.println(call1);  //5.76

       double call2 = john.testMethod(4,4.5,"add");
        System.out.println(call2);  //8.5


    }

    public double testMethod(double num1, double num2, String operationName){

        if(operationName.equalsIgnoreCase("multiply")){
           double result= num1*num2;
           return result;
        }else{
            double sum=num1+num2;
            return sum;
        }
    }
}
