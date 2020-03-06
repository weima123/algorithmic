package com.algo.sort.mergeSort;

/**
 * @author : mawei
 * @description : 归并排序
 * @since : 2020-03-06 10:24
 */
public class MergeSort {
    public static int[] arrayA = new int[]{
            1,3,5,7
    };

    public static int[] arrayB = new int[]{
            2,4,6,8
    };

    public static void main(String[] args) {
        int[] result = merge(arrayA, arrayB);
        for (int item : result){
            System.out.println(item);
        }
    }

    private static int[] merge(int[] arrayA, int[] arrayB) {
        int l = arrayA.length + arrayB.length;
        int[] result = new int[l];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                result[k] = arrayA[i];
                i++;
                k++;
            } else {
                result[k] = arrayB[j];
                j++;
                k++;
            }
        }
        while (i < arrayA.length) {
            result[k] = arrayA[i];
            k++;
            i++;
        }

        while (j < arrayB.length) {
            result[k] = arrayB[j];
            k++;
            j++;
        }
        return result;
    }
}
