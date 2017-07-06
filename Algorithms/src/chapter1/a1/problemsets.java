package chapter1.a1;

import org.jetbrains.annotations.Contract;
import sun.rmi.runtime.Log;

import static java.lang.Math.PI;

/**
 * Created by fengjw on 2017/7/5.
 */
public class problemsets {

    //1.1.1
    public static double Result1(){
        double num1 = 0;
        double num2 = 15;
        double sum = 0;
        sum = (num1 + num2)/2;
        return sum;
    }
    public static double Result2(){
        double sum = 2.0e-6 * 100000000.1;
        return sum;
    }
    public static boolean Result3(){
        boolean temp = true && false || true && false;
        boolean test1 = true && false;
        //System.out.println("true && false is :" + test1);
        return temp;
    }
    public static void test(){
        System.out.println(Math.abs(-2147483648));
        //int是32位的，可以表示的最大整数是2147483647，因为0还占有一个位置。
        //所以发生了溢出
        double x = Double.POSITIVE_INFINITY;
        double y = Double.NEGATIVE_INFINITY;
        System.out.println(x);
        System.out.println(y);
        //Infinity的意思是无穷大
    }

    //1.1.2
    public static void Result1_1_2(){
        System.out.println("(1 + 2.236)/2 = " + (1 + 2.235)/2);
        double sum1 = 0;
        sum1 = 1 + 2 + 3 + 4.0;
        System.out.println("1 + 2 + 3 + 4.0 = " + sum1);

        boolean temp = false;
        if( 4.1 >= 4){
            temp =true;
        }
        System.out.println("4.1 >= 4 : " + temp);

        System.out.println(1 + 2 + "3");//执行顺序是先执行1+2 = 3；然后转化字符串

    }

    public static void main(String [] args){
        test();
        //1.1.1
        System.out.print("1.1.1 : " + Result1());
        System.out.print(" " + Result2());
        System.out.println(" " + Result3());
        //1.1.2
        Result1_1_2();
    }
}
