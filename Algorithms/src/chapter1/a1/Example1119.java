package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/13.
 */
public class Example1119 {
    public static long F(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String [] args){
        long [] a = {0};
        for (int N = 0; N < 100; N ++){
            a[N] = F(N);
            StdOut.println(N + " " + F(N));
        }
    }
}
