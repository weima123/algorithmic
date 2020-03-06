package com.algo.leetcode;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2020-02-01 20:32
 */
public class Luoxuansz {

    public static void main(String [] args){
        int array[][] = getArray(5);
        print(array);
    }

    public static int[][] getArray(int n){
        int minX = 0;
        int maxX = n-1;
        int minY = 0;
        int maxY = n-1;

        int num = 0;
        int result[][] = new int[n][n];
        while (minX <= maxX && minY <= maxY){
           int i = minX ;
           int j = minY;
           if (minX == maxX && minY == maxY && minX == minY){
               result[i][j] = num;
           }
           //从左到又输出
           while (i == minX  && j < maxY){
               result[i][j] = num;
               num ++ ;
               j++;
           }
           //从上到下输出
           while ( j == maxY && i < maxX){
             result[i][j] = num ;
             num ++ ;
               i ++ ;
           }
           //从右到左输出
            while (i == maxX && j > minY){
                result[i][j] = num;
                num ++;
                j--;
            }
            //从下到上输出
            while (j == minY && i > minX){
                result[i][j] = num;
                num ++ ;
                i--;
            }
            minX ++;
            maxX -- ;
            minY ++;
            maxY --;
        }
        return result;

    }

    public static void print(int [][]array){
        for (int i=0 ; i<array.length ; i++ ){
            for (int j=0; j< array[i].length ; j++){
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
