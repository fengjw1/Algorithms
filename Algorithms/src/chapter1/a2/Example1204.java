package chapter1.a2;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/22.
 */
public class Example1204 {
    public static void Ex04(){
        String str1 = "Hello World!";
        String str2 = str1;
        str1 = "Hello fengjw!";
        StdOut.println("str1 = " + str1);
        StdOut.println("str2 = " + str2);
    }
}
