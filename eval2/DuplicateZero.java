package com.l2practice.eval2;

import java.util.Arrays;

public class DuplicateZero {
    public static void main(String[] args) {
        int[] arr={1, 0, 2, 3,0, 0, 4, 5, 0,7,0,5};
        int n=arr.length;
        int count=0;
        for(int num:arr) {
            if(num==0) {
                count++;
            }
        }
        for(int i=n-1;i>=0;i--) {
            if(i+count<n) {
                arr[i+count]= arr[i];
            }
            if(arr[i]==0) {
                count--;
                if(i+count<n) {
                    arr[i+count] = 0;
                }
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

}

