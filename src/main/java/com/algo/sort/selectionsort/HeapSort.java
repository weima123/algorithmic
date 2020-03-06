package com.algo.sort.selectionsort;

/**
 * @author : mawei
 * @description : 堆排序
 * @since : 2020-03-04 15:40
 * 基本思想：勾
 * 时间复杂度：
 * 空间复杂度：
 * 稳定性：
 * 适用性：
 */
public class HeapSort {

    public static int[] data = new int[]{
            10, 9, 8, 7, 6, 5
    };

    public static void main(String[] args) {
        for (int i = data.length / 2 - 1; i > 0; i--) {
            getHeap(data, data.length, 0);
        }
        for (int j = data.length - 1; j > 0; ) {
            swap(data, 0, j);
            j--;
            getHeap(data, j, 0);
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    private static void getHeap(int[] data, int length, int i) {
        int temp = data[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if (k + 1 < length && data[k] < data[k + 1]) {
                k++;
            }
            if (data[k] > temp) {
                swap(data, k, i);
                i = k;
            }
        }
    }

    private static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }


}
