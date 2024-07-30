package com.lv2practice.evaluation1;

import java.util.Scanner;

public class TargetIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(binarySearch(arr,target));
    }

     static int binarySearch(int[] arr, int target) {
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s;
    }
}
