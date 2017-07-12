package chapter1.a1;

/**
 * Created by fengjw on 2017/7/12.
 */
public class Example1118 {
    public static int mystery(int a, int b){
        if(b == 0) return 0;
        if(b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
}
