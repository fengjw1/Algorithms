package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/19.
 */
public class Example1127 {
    private static int COUNT = 0;
    private static int COUNT1 = 0;
    private static double[][] Matrix;
    //private static double[] temp = new double[100000000];
    public static double binomial(int N, int k, double p){
        COUNT ++;
        if(N == 0 && k == 0) return 1.0; //这里出现相等则跳过执行 StdOut.println(COUNT);
        if(N < 0 || k < 0) return 0.0; //同上
        //StdOut.println(COUNT);
        return (1.0 - p) * binomial(N-1,k,p) + p * binomial(N-1,k-1,p); //最后这里还执行了
    }

    public static int getCOUNT(){
        return COUNT;
    }

    private static double bin(int N, int k, double p){
        COUNT1 ++;
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        if(Matrix[N][k] == -1) Matrix[N][k] = (1.0 - p) * bin(N-1,k,p) + p * bin(N-1,k-1,p);
        return Matrix[N][k];
    }
    public static double batterbinnomial(int N, int k, double p){
        Matrix = new double[N+1][k+1];
        for(int i = 0; i <= N; i ++)
            for(int j = 0; j <= k; j ++) Matrix[i][j] = -1;
        return bin(N,k,p);
    }

    public static int getCOUNT1(){
        return COUNT1;
    }


}
