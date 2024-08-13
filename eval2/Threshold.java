package com.l2practice.eval2;

public class Threshold {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4};
        int threshold=5;

        int count=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num<=threshold){
                count++;
                continue;
            }
            while(num>threshold){
                num-=threshold;
                count++;
            }
            count++;
        }

        System.out.println(count);
    }
}
