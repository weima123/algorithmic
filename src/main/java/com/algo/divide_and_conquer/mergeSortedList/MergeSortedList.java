//package com.algo.divide_and_conquer.mergeSortedList;
//
///**
// * @author : mawei
// * @description : TODO
// * @since : 2018/9/20
// */
//public class MergeSortedList {
//
//    public static void main(String []args){
//
//        ListNode node01 = new ListNode(0);
//        for (int i = 0;i<10;i++){
//            ListNode node = new ListNode(i+1);
//
//        }
//        ListNode node02 = new ListNode();
//    }
//
//
//    public static ListNode mergeTwoSortedList(ListNode node01,ListNode node02){
//        if (node01 == null && node02 == null){
//            return null;
//        }
//        if (node01 != null && node02 == null){
//            return node01;
//        }
//        if (node01 == null && node02 != null){
//            return node02;
//        }
//        ListNode target = new ListNode();
//       while (node01 != null && node02 != null){
//            if (node01.getNode() < node02.getNode()){
//                target.setNode(node01.getNode());
//                node01 = node01.getNext();
//            }else if (node01.getNode() >= node02.getNode()){
//                target.setNode(node02.getNode());
//                node02 = node02.getNext();
//            }
//       }
//       return target;
//
//
//
//    }
//}
