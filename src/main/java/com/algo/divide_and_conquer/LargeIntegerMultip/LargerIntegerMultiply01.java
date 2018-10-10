package com.algo.divide_and_conquer.LargeIntegerMultip;

import com.algo.ArrayUtils;

/**
 * @author : mawei
 * @description : 大整数乘法
 * 思路01：循环乘
 * @since : 2018/9/25
 */
public class LargerIntegerMultiply01 {
    public static final int MAX_LENGTH = 200;
    public static void main(String[] args) {
        int [] arrayA = {00,9,8,7,6,5,4,3,2,1};
        int [] arrayB = {00,1,2,3,4,5,6,7,8,9};
        int [] result = multip(arrayA,arrayB);
        ArrayUtils.printArray(result);

    }

    public static int[] multip(int[] arrayA, int[] arrayB) {
        int[] result = new int[MAX_LENGTH*2];

        int[] temp = new int[MAX_LENGTH];
        //保证arrayA长度总是长于arrayB
        if (arrayA.length < arrayB.length) {
            temp = arrayA;
            arrayA = arrayB;
            arrayB = temp;
        }
        //1.计算乘积，不做进位处理，乘数i位和被乘数j位的结果，存在i+j位
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                result[i + j] += arrayA[i] * arrayB[j];
            }
        }

        //2.进位处理
        //进位标识记录
        int step = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 10){
                result[i+1] += result[i]/10;
                result[i] = result[i]%10;
            }
        }
        return result;
    }

}
