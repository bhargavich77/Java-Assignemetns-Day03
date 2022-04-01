//print the second largest of array
package com;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int A[] = {100, 20, 30};
        int large = A[0];
        int t=0;
        for (int i = 0; i < A.length; i++) {
            for(int j=i+1;j<A.length;j++){
                if (A[i] < A[j]) {
                    t = A[i];
                    A[i]=A[j];
                    A[j]=t;

                }
            }

        }
        System.out.println("the second larger value is " +A[1]);
    }

}
