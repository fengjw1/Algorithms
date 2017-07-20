package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/20.
 */
public class Example1129 {
    private static int COUNT = 0;
    private static int COUNT1 = 0;
    public static int rank(int key, int[] a){
        for(int i = 0; i < a.length; i ++) {
            if (a[i] < key)COUNT++;
                //StdOut.println("COUNT = " + COUNT);
            else continue;
        }
        return COUNT;
    }

    public static int count(int key, int [] a){
        for(int i = 0; i < a.length; i ++){
            if(key == a[i])COUNT1 ++;
            else continue;
        }
        return COUNT1;
    }


}
