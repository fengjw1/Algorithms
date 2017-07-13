package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/13.
 */
public class Example1120 {
    public static double In(int N){
        if(N < 0) return -1;
        if( N == 0) return 0;
        return Math.log(N) + In(N - 1);
    }

    public static void main(String [] args){
        int N = 10;
        StdOut.println(In(N));
    }

}
