package com.lv2practice.evaluation1;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String digit=in.next();
        System.out.println(count(digit));

    }

     static String count(String digit) {
        if(digit.isEmpty()){
            return "";
        }
        String ans="";
        int count=1;
        char prev=digit.charAt(0);
        for(int i=1;i<digit.length();i++){
            char curr=digit.charAt(i);
            if(curr!=prev){
                ans=ans+count+prev;
                prev=curr;
                count=1;
            }else{
                count++;
            }
        }
        ans=ans+count+prev;
        return ans;
    }
}
