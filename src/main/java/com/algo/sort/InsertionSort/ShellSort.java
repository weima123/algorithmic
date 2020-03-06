package com.algo.sort.InsertionSort;

/**
 * @author : mawei
 * @description : 希尔排序
 * @since : 2020-01-28 13:16
 * 基本思想：取一个增量gap，把数据集切分程length/gap个组，进行组内排序，然后不断缩小gap的值一般是gap/2，
 * 不断进行划分新的数据组，并进行排序，直到处理完gap = 1的组内排序后，排序完成
 *
 * 插入排序、希尔排序的对比：
 * 1）增量排序可以看作是gap = 1的希尔排序
 * 2）希尔排序性能优于直接插入排序：插入排序进行数据移动时，每次都只能跨越1个数组元素进行移动，元素移动效率低，希尔排序可以在数组内
 * 跳跃多个元素进行元素的移动，节省了耗时
 * 3）稳定性：希尔排序是一种不稳定排序，直接插入排序是一种稳定排序算法
 *
 * 试用场景：少量数据，数据基本有序的情况
 *
 * 稳定性：不稳定
 *
 * 时间复杂度：O(n^1.5)
 */
public class ShellSort {
    public static int data[] = new int[]{
           9,8,7,6,5
    };

    public static void sort() {
     int max = data.length -1;
     for (int gap = max / 2 ; gap >=1 ; gap = gap/2){
         for (int i= gap; i<= max ; i++){
             int j = i ;
             int temp = data[j];
             while (j-gap >=0 && data[j-gap] >= temp){
                 data[j] = data[j-gap];
                 j = j-gap;
             }
             data[j] = temp;
         }
     }
    }

    public static void main(String []args){
        sort();
        for (int i = 0 ;i < data.length ; i++) {
            System.out.println(data[i]);
        }
    }



}
