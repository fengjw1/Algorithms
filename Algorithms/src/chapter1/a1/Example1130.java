package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/21.
 */
public class Example1130 {
    public static int enclid(int p, int q){
        int temp = 0;
        if(p == 0 || q == 0) return 1;
        if(p < q){
            temp = q;
            q = p;
            p = temp;
        }
        if(p % q == 0) return q;
        return enclid(q, p%q);
    }

    public static void testIJ(int N, boolean[][] x){
        for (int i = 0; i < N; i ++)
            for (int j = 0; j < N; j ++)
                if(enclid(i,j) == 1){
                    x[i][j] = true;
                    StdOut.println("i = " + i + " j = " + j);
                }
    }
    public static void main(String [] args){
        int N = 100;
        boolean[][] x = new boolean[N][N];
        for(int i = 0; i < N; i ++)
            for (int j = 0; j < N; j ++)
                x[i][j] = false;
        testIJ(N,x);
        for (int i = 0; i < N; i ++)
            for (int j = 0; j < N; j ++)
                StdOut.println(x[i][j]);
    }

}
