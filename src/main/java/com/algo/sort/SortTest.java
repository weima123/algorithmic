package com.algo.sort;

/**
 *
 */
public class SortTest {


    public static int[] data = new int[]{
            10, 9, 8, 7, 6, 5
    };

    public static void sort( ) {
        int i = 0;
        while (i<data.length){
            int j = i;
            int flag = i;
            int flagValue = data[flag];
            while (j<data.length ){
                if (flagValue > data[j]){
                    flag = j;
                    flagValue = data[j];
                }
                j++;
            }
            data[flag] =data[i];
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
