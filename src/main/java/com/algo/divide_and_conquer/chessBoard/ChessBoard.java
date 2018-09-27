package com.algo.divide_and_conquer.chessBoard;

/**
 * @author : mawei
 * @description : 棋盘覆盖问题
 *
 * @since : 2018/9/18
 */
public class ChessBoard {

    //L形股票标记
    public  static int title = 1;
    public static int [][]chessBoard = new int[4][4];


    public static void main(String []args){
        for (int i = 0;i<4;i++){
            for (int k=0;k<4;k++){
                chessBoard[i][k]= 9;
            }
        }
        chess(0,0,0,0,4);

        for (int i = 0 ;i <4;i++){
            for (int k=0;k<4;k++){
                System.out.print(chessBoard[i][k] +" ");
            }
            System.out.println("/n");
        }
    }
    /**
     * @param tr 方格的起始行
     * @param tc 方格的起始列
     * @param dr 特殊位置行
     * @param dc 特殊位置列
     * @param size 方格大小
     */
    public static void chess(int tr,int tc,int dr,int dc,int size){
         if (size == 1){
             return;
         }
         int t = title ++;
         int s = size/2;

         //1.填充左上角子棋盘
        /**特殊方格在左上角子棋盘**/
        if (dr <= tr +s -1 && dc <= tc +s -1){
            /**覆盖其他方格**/
            chess(tr,tc,dr,dc,s);
            /**特殊方格不在左上角子棋盘**/
        }else {
            /**覆盖左上角子棋盘右下角方格**/
           chessBoard[tr+s-1][tc+s-1] = t;
           /**假定已覆盖方格为特殊方格,防止重复覆盖,覆盖左上角子棋盘剩余方格**/
           chess(tr,tc,tr+s-1,tc+s-1,s);
        }
        //2.填充右上角棋盘
        /**特殊方格在右上角棋盘内**/
        if(dr <= tr+s-1 && dc > tc +s -1){
            /**覆盖右上角其他方格**/
            chess(tr,tc+s,dr,dc,s);
            /**特殊方格不在右上角棋盘内**/
        }else {
            /**覆盖右上角棋盘左下角方格**/
            chessBoard[tr+s-1][tc+s] = t;
            /**假定已覆盖方格为特殊方格，防止重复覆盖，覆盖右上角子棋盘内其他方格**/
            chess(tr,tc+s,tr+s-1,tc+s,s);
        }
        //3.填充左下角子棋盘
        /***特殊方格在左下角子棋盘内***/
        if (dr > tr+s-1 && dc <= tc+s -1){
            /**覆盖左下角子棋盘内其他方格**/
             chess(tr+s,tc,dr,dc,s);
            /**特殊方格不在左下角子棋盘内***/
        }else {
            /**覆盖子棋盘右上角方格***/
            chessBoard[tr+s][tc+s-1]= t;
            /**已覆盖方格作为特殊方格，覆盖其他方格**/
            chess(tr+s,tc,tr+s,tc+s-1,s);
        }
        //4.填充右下角棋盘
        /**特殊方格在子棋盘内**/
        if(dr> tr+s-1 && dc > tc+s -1){
           /**覆盖子棋盘内其他方格**/
           chess(tr+s,tc+s,dr,dc,s);
           /**特殊方格不在子棋盘内***/
        }else {
            /**覆盖子棋盘左上角方格**/
            chessBoard[tr+s][tc+s] = t;
            /**已覆盖方格作为特殊方格，覆盖子棋盘其他方格**/
            chess(tr+s,tc+s,tr+s,tc+s,s);
        }


    }
}
