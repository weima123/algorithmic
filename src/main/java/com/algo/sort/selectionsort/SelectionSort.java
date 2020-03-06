package com.algo.sort.selectionsort;

/**
 * @author : mawei
 * @description : 直接选择排序
 * @since : 2020-02-02 10:37
 * 基本思想：从尾到头扫描，找出最小的元素，和第一个元素进行交换，接着在剩下的元素序列中继续这种操作，直到最后一个
 * 元素。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 * 适用场景：少量数据元素
 */
public class SelectionSort {
    public static int[] data = new int[]{
            10, 9, 8, 7, 6, 5
    };

    private static void sort(){
       int i = 0;
       while (i<data.length){
           int k = i;
           int flag = k ;
           int flagValue = data[flag];
           while (k < data.length -1){
               if (flagValue > data[k+1]){
                 flagValue = data[k+1];
                 flag = k +1;
               }
               k++;
           }
           data[flag] = data[i];
           data[i] = flagValue;
           i++;
       }
    }

    public static void main(String[] args) {
        sort();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}
