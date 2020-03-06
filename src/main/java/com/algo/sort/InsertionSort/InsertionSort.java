package com.algo.sort.InsertionSort;

/**
 * @author : mawei
 * @description : 插入排序
 * @since : 2020-01-28 11:47
 * 插入排序基本思想：存在序列v[n],当插入第i个元素时，前面的v[0]～v[i-1]的元素已经排好序了，
 * 因此只需要找到v[i]应该插入的位置j将v[i]插入位置j并将j～i位置的元素后移
 * 稳定性：稳定
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 适用情况：待排序数据数据量较小或者待排序数据基本有序的情况
 */
public class InsertionSort {
    public static int [] data = new int[] {
           9,8,7,6,5
    };

    public static void sort(){
     for(int i= 1 ; i<= data.length-1 ; i++){
         int j = i ;
         int temp = data[j];
         while (j-1 >=0 && data[j-1] >= temp){
             data[j] = data[j-1];
             j--;
         }
         data[j] = temp;
     }
    }

    public static void main(String [] args){
        sort();
        for (int i = 0 ; i< data.length ; i++){
            System.out.println(data[i]);
        }

    }




}
