package com.l2practice.eval2;

public class Substring {
    public static void main(String[] args) {
        String str1 = "thistest123string123";
        String str2 = "tpt";

        System.out.println(isSubstring(str1,str2));

    }

    private static int isSubstring(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if(n1<n2){
            return -1;
        }
        for(int i=0;i<=(n1-n2);i++){
            String curr="";
            for(int j=i;j<(i+n2);j++){
                curr= curr + str1.charAt(j);
            }
            if(isSame(curr,str2)){
                return i;
            }
        }
        return -1;
    }

    private static boolean isSame(String curr, String str2) {
        for(int i=0;i<curr.length();i++){
            if(str2.charAt(i)!=curr.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
