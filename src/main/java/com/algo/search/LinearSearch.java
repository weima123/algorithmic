package com.algo.search;

/**
 * @author : mawei
 * @description : 线性查找
 * @since : 2020-02-01 14:00
 * 基本思想：从列表的一端依次做查找，直到找到关键字对应的数据为止。
 * 平均查找时间：(n+1)/2
 * 适用数据：适用于列表或者数组形式存储的数据的查找
 *
 */
public class LinearSearch {

    public static int [] data = new int []{
       1,2,3,4,6,7,8
    };

    public static void main(String [] args){
        System.out.println(search(1));
    }


    public static Boolean search(int key){
        for (int i=0;i<data.length;i++){
            if (data[i] == key){
                return true;
            }
        }
        return false;
    }

}
