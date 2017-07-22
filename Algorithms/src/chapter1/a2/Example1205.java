package chapter1.a2;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/22.
 */
public class Example1205 {
    public static void Ex05(){ //返回的是原对象，因为s对象没有发生改变
        String s = "Hello World";
        s.toUpperCase();
        //s.toLowerCase();
        String temp = s.substring(6,11);
        StdOut.println("s = " + s);
        StdOut.println("temp = " + temp);
    }
}
