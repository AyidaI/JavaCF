package com.java.interviewQuestion.BeknazarTechlead;
//A palindrome is a word, phrase, number, or
// sequence of words that reads the same backward as forward.
public class StringPalindrome {
    public static void main(String[] args) {
        StringPalindrome stringPalindrome=new StringPalindrome();
        stringPalindrome.isPal("Level");
        System.out.println(stringPalindrome.isPal("kayak"));
    }

    public boolean isPal(String str){
        //we will use two pointers. One pointer will start looking from beginning
        //another from the back. If values of pointers are not equal, we can return false

        int j = str.length()-1;  //pointer for the back

        //loop will go till half because we have two pointers
        for(int i=0; i<str.length()/2; i++){

            //if pointer values are not equal return false
            if(str.charAt(i) !=str.charAt(j-i)){
                return false;
            }
        }
        //if program reach here, it means all values were equal so it is palindrome
        return true;
    }
}
// Time Complexity: O(n/2) but we can say just O(n)