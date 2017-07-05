package chapter1.a1;

/**
 * Created by fengjw on 2017/7/5.
 */
public class problemsets {
    public static void main(String [] args){
        System.out.println(Math.abs(-2147483648));
        //int是32位的，可以表示的最大整数是2147483647，因为0还占有一个位置。
        //所以发生了溢出
        double x = Double.POSITIVE_INFINITY;
        double y = Double.NEGATIVE_INFINITY;
        System.out.println(x);
        System.out.println(y);
        //Infinity的意思是无穷大
        
    }
}
