package com.java.arrays;

public class Practice7 {
    public static void main(String[] args) {
//count each symbols
        char[] symbols = {'a', 'b', '#', '1', 'W', '3', '6', '9','@'};
        //print only numbers
        int dig=0, let=0, oth=0;

        for(int index=0; index< symbols.length; index++){
            if(symbols[index] >= '0' && symbols[index]<='9'){

               dig++;

                System.out.println(symbols[index]); // 1 3 6 9
                System.out.println("=================");
            }else if(symbols[index] >= 'a' && symbols[index]<='z' ||
                    symbols[index] >= 'A' && symbols[index]<='Z'){
                let++;
                System.out.println("This are Letter "+symbols[index]);

            }else {
                oth++;
                System.out.println("Others ->"+symbols[index]);
            }
        }
        //print after for loop
        System.out.println("There are "+dig+" digits");  //There are 4 digits
        System.out.println("There are "+let+" letters");  //There are 3 letters
        System.out.println("There are "+oth+" others");  //There are 2 others
    }
}
