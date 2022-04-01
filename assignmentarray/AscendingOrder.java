//print the ascending order of array
package com;

public class AscendingOrder {
    public static void main(String[] args) {
        int A[]={54,32,78,21};
        int t=0;
        System.out.println("numbers in array is : ");
        for(int i=0; i<A.length; i++){
            System.out.println(A[i] + "");
        }
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                }
            }
        }
        System.out.println("the ascending  order is ");

        for(int i=0;i<A.length;i++){

            System.out.print(A[i] + " ");
        }
    }

}
