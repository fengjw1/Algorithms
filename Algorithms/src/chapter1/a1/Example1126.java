package chapter1.a1;

/**
 * Created by fengjw on 2017/7/18.
 */
public class Example1126 {
    public static String sort(Object a, Object b, Object c){
        double temp;
        if((double)a > (double)b){
            temp = (double)a;
            a = b;
            b = temp;
        }

        if((double)a > (double)c){
            temp = (double)a;
            a = c;
            c = temp;
        }

        if((double)b > (double)c){
            temp = (double)b;
            b = c;
            c = temp;
        }
        return "a = " + a + " b = " + b + " c = " + c;
    }
}
