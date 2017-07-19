package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Test {
    public static void main(String [] args){
        //1.1.05
        //System.out.println("1.1.5 :" + Example1105.isRight());

        //1.1.06
        //Example1106.Result();

        //1.1.09
        //Example1109.test();
//        int[] a = new int[10];
//        for(int i = 0; i < 10; i ++){
//            a[i] = 9 - i;
//        }
//        for(int i = 0; i < 10; i ++){
//            a[i] = a[a[i]];
//            System.out.println(a[i]);
//        }
//        for(int i = 0; i < 10; i ++){
//            //System.out.println(i);
//        }

        //1114
        //System.out.println(Example1114.lg(31));\

        //1115
//        int[] a = {0,3,4,4,1,5,2,4,};
//        int M = 9;
//        System.out.println("M = " + M);
//        int sum = 0;
//        int R[] = Example1115.histogram(a, M);
//        for(int i = 0; i < R.length; i ++){
//            System.out.print(R[i] + " ");
//            sum += R[i];
//        }
//        System.out.println();
//
//        if(sum != a.length){
//            System.out.println("是不相等的,且sum = " + sum + ", a.length = " + a.length);
//        }else {
//            System.out.println("是相等的,且sum = a.length = " + sum);
//        }
        //1.1.16
        //System.out.println(Example1116.exR1(6));
        //1.1.18
//        int result1 = Example1118.mystery(2,25);
//        int result2 = Example1118.mystery(3,11);
//        System.out.println(result1);
//        System.out.println(result2);
//        //1126
//        Object a = StdIn.readDouble();
//        Object b = StdIn.readDouble();
//        Object c = StdIn.readDouble();
//        System.out.println(Example1126.sort(a,b,c));
        //1127
        int N = 0;
        int k = 0;
        double p = 0;
        //StdOut.println("result: " + Example1127.binomial(3,1,0.25) + " count: " + Example1127.getCOUNT());
        StdOut.println("result: " + Example1127.batterbinnomial(3,1,0.25) + " count: " + Example1127.getCOUNT1());
        //StdOut.println(Example1127.binomial(N,k,p));
        //double[] temp = Example1127.getTemp();
//        for(int i = 0; i < Example1127.getTemp().length; i ++){
//            StdOut.println(temp[i]);
//        }

    }
}
