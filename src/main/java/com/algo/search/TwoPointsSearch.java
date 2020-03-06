package com.algo.search;

/**
 * @author : mawei
 * @description : 二分查找
 * @since : 2020-02-01 14:21
 * 基本思想：创建哨兵i,j,获取中间位置元素middle = (left+right)/2,比较待查询关键字key
 * 和待排序序列中间位置的元素middle，
 * 1)如果key > middle ，从右半部分查找
 * 2)如果key < middle，从左半部分查找 ，
 * 3)如果key == middle ，查找成功 ，直接返回
 * 重复上述操作，直到left = right 或者查找成功
 * 时间复杂度：O(log^n)
 * 空间复杂度：O(0)
 *
 */
public class TwoPointsSearch {

    public static int [] data = new int[]{1,2,3,4,5,6,7,8,9};

    public static void main(String []args){
        System.out.println("递归实现");
        System.out.println(search(9,0,data.length-1));
        System.out.println("非递归实现");
        System.out.println(search(9));
    }

    //递归
    public static Boolean search(int key, int left ,int right){
        if (left>right){
            return false;
        }
        int half = (left+right)/2;
        if (left == right && data[half] != key){
            return false;
        }
        if (data[half] == key){
            return true;
        }
        if (data[half] < key){
           return search(key,half+1,right);
        }else{
           return search(key,left,half-1 );
        }
    }

    public static Boolean search(int key){
        int left = 0 ;
        int right = data.length -1 ;

        while (left <= right){
            int middle = (left+right)/2;
            if (data[middle] == key){
                return true;
            }else if (data[middle] > key){
                right = middle - 1 ;
            }else {
                left = middle + 1;
            }
        }
        return false;
    }
}
