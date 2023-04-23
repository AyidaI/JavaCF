package com.java.interviewQuestion.practices;

public class SearchArray {

    int[] nums = {2,6,9,13,17,19,32,38,45,98,111,156,187};

    public void sort(int value){
        int arraySize = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==value) {
                System.out.println("Value is present at index " + i);
            }else{
                System.out.println("Value is not present in the Array");
            }
        }


    }
    public static void main(String[] args) {
        SearchArray search = new SearchArray();
    }
}
