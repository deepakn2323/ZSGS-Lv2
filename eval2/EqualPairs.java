package com.l2practice.eval2;

import java.util.Arrays;

public class EqualPairs {
    public static void main(String[] args) {
        int[] nums ={3,2,3,2,4,4};
        System.out.println(equalPairs(nums));
    }

    private static boolean equalPairs(int[] nums) {
        int[] countArr=new int[5001];
        for(int n:nums){
            countArr[n]++;
        }
        for(int n:nums){
            int k=countArr[n];
            if(k%2!=0){
                return false;
            }
        }
        return true;
    }
}
