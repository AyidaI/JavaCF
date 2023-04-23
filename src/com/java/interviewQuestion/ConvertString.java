package com.java.interviewQuestion;
/*
 Write a code to convert the following string.
Input : aaabbbaaacc
Output : a3b3a3c2
 */
public class ConvertString {
    public static void main(String[] args) {

        String str = "aaabbbaaaccc";
        String output = "";

        char[] strChr = str.toCharArray();
        int j=1;

        for(int i=0; i< strChr.length-1; i++){

            if(strChr[i] == strChr[i+1]){
                j++;

            }else{
                output +=strChr[i]+j;
                j=1;
            }
        }
        output+= strChr[strChr.length-1]+j;
        System.out.println("Output "+output);
    }
}
