//print the smallest of array
package com;

public class SmallestOfArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int small = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < small) {
                small = A[i];

            }
        }
        System.out.println("the smaller value is " +small);
    }
}


