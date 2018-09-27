package com.algo;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/27
 */
public class ArrayUtils {
    public static void printArray(int []array){
        if (array == null || array.length ==0 ){
           System.out.print("array is empty");
        }
        Boolean flag = false;
        for (int i=array.length-1;i>=0;i--){
           if (array[i] == 0 && !flag){
               continue;
           }else {
               flag = true;
           }
           System.out.print(array[i]);

        }
    }
}
