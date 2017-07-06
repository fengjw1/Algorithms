package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1105 {

    public static boolean isRight(){
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if(x <= 1 && x >= 0)
            if(y <= 1 && y >= 0) return true;
        return false;
    }
}
