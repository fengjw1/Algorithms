package chapter1.a1;

import edu.princeton.cs.algs4.In;

/**
 * Created by fengjw on 2017/7/5.
 * 二分法实现
 */


public class BinarySearch {
    public static int rank(int key, int [] a){//两个参数，一个是要查找的关键字key，一个是需要查找的数组a[]
        //int mid = 0;
        int low = 0;
        int hight = a.length -1;
        System.out.print("二分法查询的结果为：");
//        while(low <= hight){
//            int mid = low + (hight - low)/2;
//            if(key < a[mid]){
//                hight = mid -1;
//            }else if(key > a[mid]){
//                low = mid +1;
//            }else{
//                return a[mid];
//            }
//        }
        //这里可以使用另一种方法实现：
        while(low <= hight){
            int mid = low + (hight - low)/2;
            if(key < a[mid]) hight = mid -1;
            if(key > a[mid]) low = mid +1;
            if(key == a[mid]) return a[mid];
        }


        System.out.println("无查询的数字");
        return 0;
    }

    public static void main(String [] args){
        int [] a = {1,2,3,4,6,7,8}; //数组是有序的
        int key = 6;
        System.out.println(rank(key, a));
    }


}