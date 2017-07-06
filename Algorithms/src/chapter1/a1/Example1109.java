package chapter1.a1;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1109 {
    public static void test(){  //求任意整数的二进制    利用十进制转化为二进制的方式进行计算
        String s = "";
        int N = 6;
        for(int n = N; n>0 ; n /= 2){
            System.out.println("n: " +n);
            s = (n % 2) + s; //组合的次序非常重要，第一个是最右边的，然后第二个要放到s的左边，以此类推。
            //类似与一个栈的方式存放数据
            //s = s + (n % 2);
            System.out.println(s);
        }
    }
}
