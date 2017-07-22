package chapter1.a2;

/**
 * Created by fengjw on 2017/7/22.
 */
public class Example1207 {
    public static String  mystery(String str){
        int N = str.length();
        if (N <= 1) return str;
        String a = str.substring(0,N/2);
        String b = str.substring(N/2,N);
        return mystery(b) + mystery(a);
    }
}
