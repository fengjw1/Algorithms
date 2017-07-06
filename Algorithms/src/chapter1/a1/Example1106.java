package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1106 {
    public static void Result(){
        int f =0;
        int g = 1;
        for(int i = 0; i <= 15; i ++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        //return f;
    }
}
