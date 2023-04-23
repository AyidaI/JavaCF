package com.java.allOtherPractices.chirags.array;

public class FindTransposeOfMatrix {
    public static void main(String[] args) {
        int data[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[j][i]);
            }
            System.out.println();  //to press inter we need second SOP
        }

    }}

/*
out/put -> j i
147
258
369
 */