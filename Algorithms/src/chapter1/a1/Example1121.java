package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/13.
 */
public class Example1121 {
    public static void main(String [] args){
        System.out.println("Please input the count:");
        int n = StdIn.readInt(); //首先输入一个数组大小的值
        String[] nameArray = new String[n];
        int[] integerArray1 = new int[n];
        int[] integerArray2 = new int[n];
        for(int i = 0; i < n; i ++){
            nameArray[i] = StdIn.readString();//每次都会换一行
            integerArray1[i] = StdIn.readInt();
            integerArray2[i] = StdIn.readInt();
        }
        StdOut.println("------------------------");

        for(int i = 0; i < n; i ++){
            System.out.printf("|%4s|%4d|%4d|%6.3f\n", nameArray[i], integerArray1[i], integerArray2[i],
                    (float)integerArray1[i]/integerArray2[i]);
        }
        StdOut.println("------------------------");
    }
}
