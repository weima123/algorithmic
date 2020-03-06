package com.algo.leetcode;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2020-03-04 16:45
 */
public class YiWeiCi {

    public static void main(String[] args) {
        String x = "abc";
        String y = "cbh";
//        Boolean result = solute(x, y);
        Boolean result = solute02(x, y);
        System.out.println(result);
    }

    private static Boolean solute(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        int[] hashArray = new int[26];
        for (int i = 0; i < x.length(); i++) {
            hashArray[x.charAt(i) - 'a']++;
            hashArray[y.charAt(i) - 'a']--;
        }

        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] != 0) {
                return false;
            }
        }
        return true;
    }


    private static Boolean solute02(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        x = sort(x);
        y = sort(y);
        return x.equals(y);
    }


    private static String sort(String x) {
        char[] xChars = x.toCharArray();
        for (int i = 0; i < xChars.length; i++) {
            for (int j = xChars.length - 1; j >= i; j--) {
                char temp = xChars[j];
                if (j >= 1 && temp > xChars[j - 1]) {
                    xChars[j] = xChars[j - 1];
                    xChars[j - 1] = temp;
                }
            }
        }
        return String.valueOf(xChars);
    }
}
