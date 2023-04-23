package com.java.stringBuilder;
/*
-Task ---
create a method
pass a StringBuilder parameter to the method
that method will return sum of digits from given StringBuilder object
     "AFA@$%adfg56y2L" ==> 5+6+2 --> 13
 */
public class ClassPractice {

    public static int sum(StringBuilder builder){
        int sum= 0;
        for (int i = 0; i<builder.length(); i++){
            if(builder.charAt(i)>='0' && builder.charAt(i) <='9'){
             //   sum+= builder.charAt(i);
                sum+=Integer.parseInt(""+builder.charAt(i));  //solution 1
         //       sum+=Integer.parseInt(String.valueOf(""+builder.charAt(i)));  //solution2

        }}
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder( "AFA@$%adfg56y2L");
        sum(stringBuilder);
    }
}
