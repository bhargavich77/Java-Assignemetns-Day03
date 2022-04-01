//print the largest value of an array
package com;
public class largestOfAnArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int large = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > large) {
                large = A[i];

            }
        }
        System.out.println("the larger value is "+ large);
    }
}

