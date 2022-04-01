package com;

public class FrequencyOfArray {

    public static void main(String[] args) {
        int arr[]  ={1,1,1,1,2,2,2,3,3,4};
        int fr[] = new int [arr.length];
        int reach = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = reach;
                }
            }
            if(fr[i] != reach)
                fr[i] = count;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != reach)
                System.out.println("    " + arr[i] + "  " + fr[i]);
        }

    }



}
