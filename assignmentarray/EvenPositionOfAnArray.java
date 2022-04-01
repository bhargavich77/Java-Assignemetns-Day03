//print the evenposition values of array
package com;

public class EvenPositionOfAnArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7};
        for(int i =1;i<A.length;i=i+2){
            System.out.println(A[i]);
        }
    }
}

