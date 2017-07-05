package chapter1.a1;

/**
 * Created by fengjw on 2017/7/4.
 */

/*
    得到静态方法
 */
public class GetStaticMathod {

    //get integer absolute
    public static int abs(int x){
        if( x < 0){
            x = -x;
        }
        return x;
    }

    //get double absolute
    public static double ads(int x){
        if(x < 0.0){
            x = -x;
        }
        return x;
    }

    // isPrime 质数
    public static boolean isPrime(int x){
        if(x < 2) return false;
        for(int i = 2; i * i < x; i ++){
            if(x % i == 0) return false;
        }
        return true;
    }

    //count square root
    //牛顿迭代法
    public static double sqrt(double x){
        if(x < 0) return Double.NaN;
        double err = 1e-15; // 10的负15次方
        double t = x;
        while(Math.abs(t - x/t) > err * t)
            t = (x/t + t) / 2.0; //牛顿迭代法基本公式
        return t;
    }

    //right triangle hypotenuse
    public static double hypotenuse(double a, double b){
        return sqrt(a * a + b * b);
    }


    //harmonic series
    public static double harmonicSeries(int x){
        for(int i = 0; i <= x; i ++ ){
            x += 1/i;
        }
        return x;
    }

    public static void main(String [] args){
        //System.out.println(1e-15);
        //System.out.println(Double.NaN);
        double x = sqrt(3.0);
        System.out.println(x);
        System.out.println(hypotenuse(3,4));


    }

}
