package com.algo.sort.exchangesort;

/**
 * @author : mawei
 * @description : 冒泡排序
 * @since : 2020-01-29 13:10
 * 基本思想：依次比较待排序序列内相邻的两个元素的关键字，如果两个元素存在顺序相反的情况，则进行交换，直到所有
 * 元素都不存在顺序相反的情况为止
 *
 * 稳定性：是一种稳定性算法
 *
 * 时间复杂度：O(n^2)
 *
 * 试用范围：少量数据，数据基本有序
 *
 */
public class BubbleSorting {
    public static int [] data = new int[] {
          10,9,8,7,6,5
    };

    public static void sort(){
       int max = data.length -1 ;
       for (int i= 0 ; i<= max ; i++){
           int j = max;
           while (j>i && data[j-1] > data[j]){
               int temp = data[j];
               data[j] = data[j-1];
               data[j-1] = temp;
               j--;
           }
       }
    }

    public static void main(String []args){
        sort();
        for (int i=0 ; i< data.length ; i++){
            System.out.println(data[i]);
        }
    }
}
