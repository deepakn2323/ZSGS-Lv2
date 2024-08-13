package com.l2practice.eval2;

public class Maximum {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//        int k=3;
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 3;
        int n=arr.length;
        for(int i=0;i<=(arr.length-k);i++){
            int max=-9999999;
            for(int j=i;j<(i+k);j++){
                int num=arr[j];
                if(max<num){
                    max=num;
                }
            }
            System.out.print(max+" ");
        }
    }
}
