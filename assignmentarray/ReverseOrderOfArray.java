//print the reverse order of array
package com;

public class ReverseOrderOfArray {
    public static void main(String[] args) {
        int B[]={12,34,23,45};
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+ " ");
        }
        System.out.println(" ");
        for(int j=B.length-1;j>=0;j--){
            System.out.print(B[j]+" ");
        }
    }
}
