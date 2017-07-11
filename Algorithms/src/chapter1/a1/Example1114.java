package chapter1.a1;

/**
 * Created by fengjw on 2017/7/11.
 */
public class Example1114 {
    /*
    题意要求是整数，所以N必然是大于0的，
    求的是(y = 2^x) <= N;
     */
    private static int x = 0;
    private static int y = 1;
    public static int lg(int N){
        if(N <= 0) return -1;

        while(y <=  N){
            y *= 2;
            x++;
        }
        return x-1;
    }
}
