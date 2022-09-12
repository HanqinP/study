package 算法;

public class LeetCode14_longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String commonFix = "";
        commonFix = strs[0];

        if(strs.length<1) return "";
        if(strs.length==1) return strs[0];

        for(int i = 1;i<strs.length; i++){
            commonFix =  commonPrefix(commonFix,strs[i]);
            if(commonFix == "") return "";
        }

        return commonFix;

    }

    public static String commonPrefix(String str1, String str2){
        int minLength = Math.min(str1.length(),str2.length());
        for(int i = 0;i<minLength;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return str1.substring(0,i);
            }
        }
        return str1.length()>str2.length()?str2:str1;
    }


    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
        String test = "result".substring(0,0);
        System.out.println(test);
        System.out.println(result);
    }

}
