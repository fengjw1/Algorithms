package chapter1.a1;

/**
 * Created by fengjw on 2017/7/11.
 */
public class Example1116 {
    public static String exR1(int n){
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}
