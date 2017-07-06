package chapter1.a1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1107 {

    //1.1.7.(1)
    public static void test1() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
    }

    //1.1.7.(2)
    public static void test2(){ //求前n个数的和
        int sum = 0;
        for(int i = 1; i < 100; i++){
            for(int j = 0; j < i; j++){
                sum ++;
                StdOut.println(sum);
            }
        }
        //StdOut.println(sum);
    }

    public static void test3(){
        int sum = 0;
        for(int i = 1; i < 100; i *= 2){ //100 大于 2的前几次方的和，然后就求出2的前几次方的和是多少
             sum += i;
            StdOut.println(sum);
//            for(int j = 0; j < i; j ++){//j<i 表示 sum就会加i次，即sum加一个i的值。
//                sum ++;
//                StdOut.println(sum);
//            }
        }
    }

    public static void main(String [] args){ //求9 的平方根，用牛顿迭代法 求出的是近似值
        //test1();
        //test2();
        //test3();


        //1.1.8.(3)
        System.out.println((char)('a' + 4));
    }
}
