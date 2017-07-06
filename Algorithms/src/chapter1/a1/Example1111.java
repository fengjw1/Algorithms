package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1111 {

    public static final int M = 10;
    public static final int N = 4;

    public static void main(String [] args){
        boolean[][] a = new boolean[M][N];
        a = RandomInit(a);
        printBool(a);
    }

    //输出内容
    public static void printBool(boolean[][] a){
        for(int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                if(a[i][j])
                    System.out.print("*" + " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //产生随机布尔值
    public static boolean[][] RandomInit(boolean[][] a){
        for(int i = 0; i < M; i ++){
            for (int j = 0; j < N; j ++){
                a[i][j] = StdRandom.bernoulli();
            }
        }
        return a;
    }
}
