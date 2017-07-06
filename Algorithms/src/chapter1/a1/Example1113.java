package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1113 {
    //Math.random()方法是产生一个双精度的范围为（0.00 - 1.00）之间的一个随机数
    public static final int M = 10;
    public static final int N = 5;
    public static final int n = 10;//定义产生随机数的范围
    public static void main(String [] args){
        //System.out.println((int)(Math.random()*10));
        int[][] num1 = new int[M][N];
        int[][] num2 = new int[N][M];
        num1 = RandomInitialization(num1,n);
        showResult(num1,num2);
    }

    public static void showResult(int[][] num1, int[][] num2){
        System.out.println("反转之后的数组为：");
        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j ++) { //一定注意第二个 是j 不是i； 找了一晚上，心态爆炸！！！！
                num2[j][i] = num1[i][j]; //定义为[N][M]就已经改变了数组的大小，自然可以放得下
            }
        }
        //显示反转后的数组
        for(int i = 0; i < N; i ++){
            for (int j = 0; j < M ; j ++){
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] RandomInitialization(int [][] num, int n){
        StdOut.println("num1数组内容为：");
        for(int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                num[i][j] = StdRandom.uniform(10);
                StdOut.print(num[i][j] + " ");
            }
            StdOut.println();
        }
        return num;
    }
}
