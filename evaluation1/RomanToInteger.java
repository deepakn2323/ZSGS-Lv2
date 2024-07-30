package com.lv2practice.evaluation1;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String roman=in.next();
        System.out.println(convertToInteger(roman));
    }

     static int convertToInteger(String roman) {
        int ans=0,prev=0,num=0;
        for(int i=roman.length()-1;i>=0;i--){
            char ch = roman.charAt(i);
            switch(ch){
                case 'I':num=1;break;
                case 'V':num=5;break;
                case 'X':num=10;break;
                case 'L':num=50;break;
                case 'C':num=100;break;
                case 'D':num=500;break;
                case 'M':num=1000;break;
            }
            if(num<prev){
                ans=ans-num;
            }else{
                ans=ans+num;
            }
            prev=num;
        }
        return ans;
    }
}
