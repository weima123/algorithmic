package com.algo.sort.exchangesort;

/**
 * @author : mawei
 * @description : 快速排序
 * @since : 2020-01-30 15:00
 * 参考地址：https://www.cnblogs.com/KuJo/p/8544775.html
 * 基本原理：1.根据基准数将待排序队列分成两部分，其中一部分的关键字比另一部分都要小，然后通过递归对两部分数据分别再
 * 做排序，直到整个队列有序。
 * 2.在待排序列表中选定一个基准数（一般是第一个元素），选定两个哨兵i,j，当i<j时，根据哨兵j寻找比基准数
 * 小的元素，根据哨兵i寻找比基准数大的元素，并交换i、j对应的元素，当i=j时，交换基准数和i对应的元素。之后根据递归
 * 依次处理i(j)左边和右边的序列，直到序列有序
 * 稳定性：不稳定
 * 时间复杂度：最坏时间复杂度：O(n^2) 最好时间复杂度：O(log^n)
 * 空间复杂度：O(2)
 * 快速排序一定要从右边开始的原因：https://blog.csdn.net/lkp1603645756/article/details/85008715
 * 我们一定要从基准数的对立面开始排序
 *
 */
public class QuickSort {
    public static int[] data = new int[]{
            9,8,7,6,5
    };

    public  static void sort(int left , int right){
        int i = left;
        int j = right;
        if (i>j){
            return;
        }
        int temp = data[left];
        while (i != j){
            while (j>i && data[j] >= temp){
                j--;
            }
            while (j>i && data[i] <= temp){
                i++;
            }
            if(j>i){
                int temp02 = data[j];
                data[j] = data[i];
                data[i] = temp02;
            }
        }
        int temp02 = data[i];
        data[i] = temp;
        data[left] = temp02;
        sort(left,i-1);
        sort(i+1,right);
    }

    public static void main(String[] args) {
        sort(0,data.length-1);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
