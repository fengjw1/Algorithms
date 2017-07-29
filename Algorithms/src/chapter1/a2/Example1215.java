package chapter1.a2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/29.
 */
public class Example1215 {  //报错1.In API中的name必须原先建立 2.parseInt（）必须传入int类型。
    public static int[] readInts(String name){
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i ++){
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String [] args) {
        String name = "fengjw";
        int[] names = readInts(name);
        for (int i = 0; i < names.length; i++){
            StdOut.println(names[i]);
        }
    }
}
