package com.lv2practice.evaluation1;

import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
//        String s="barfoothefoobarman";
//        String[] words = {"foo","bar"};

//        String s="wordgoodgoodgoodbestword";
//        String[] words={"word","good","best","word"};

        String s="barfoofoobarthefoobarman";
        String[] words={"bar","foo","the"};

        String ans=searchSubstring(s,words);
        String[] result=ans.split(" ");
        System.out.println(Arrays.toString(result));
    }

     static String searchSubstring(String s, String[] words) {
         String res="";
         String wordsConcated="";
         for(String str : words){
             wordsConcated+=str;
         }
         for(int i=0;i<=(s.length()-wordsConcated.length());i+=words[0].length()){
             String curr=s.substring(i,(wordsConcated.length()+i));
             if(isContains(curr,wordsConcated,words[0].length())){
                 res=res+" "+i;
             }
         }
         return res.trim();
    }

    static boolean isContains(String curr, String wordsConcated, int length) {
        String seen="";
        System.out.println(seen);
         for(int i=0;i<curr.length();i+=length){
             String str= curr.substring(i,i+length);
             if(wordsConcated.contains(str)&&!(seen.contains(str))){
                 seen=seen+str;
             }else{
                 return false;
             }
         }
         return true;
    }

}
