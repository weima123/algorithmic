package com.algo.search;

/**
 * @author : mawei
 * @description : 二分搜索法  时间复杂度O(logn)
 * @since : 2018/9/18
 */
public class BinarySearch {
    public static int binarySearch(int []nums,int keyWord){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int middle = (left+right)/2;
            if (nums[middle] == keyWord){
                return middle;
            }else if(keyWord > nums[middle]){
                left = middle +1;
            }else if (keyWord < nums[middle]){
                right = middle -1;
            }
        }
        return -1;
    }
}
