package com;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        int x[] = {1,2,3,3,5,4,1};
        for(int i=0;i<x.length;i++) {
            for(int j=i+1;j<x.length;j++) {
                if(x[i]==x[j] && i != j) {
                    System.out.println("duplicate Element: "+x[i]);
                }
            }
        }

    }

}