package chapter1.a2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/22.
 */
public class Example1206 {
    public static void Loopback(){
        String s = StdIn.readLine();
        String t = StdIn.readLine();
        if (s.length() == t.length())
            if (s.concat(s).indexOf(t) >= 0){ //indexof()是一个查找是否存在有字符串的方法
                StdOut.println(s.concat(s));
                StdOut.println(s.concat(s).indexOf(t));
                StdOut.println( s + " is the circulor rotation of " + t);
            } else{
                StdOut.println( s + " is not the circulor rotation of " + t);
            }
    }
}
