package chapter1.a1;

/**
 * Created by fengjw on 2017/7/16.
 */
public class Example1124 {

    public static int Euclid(int p, int q){
        int temp = 0;
        if(p == 0 || q == 0) return 1;
        System.out.println("p = " + p + " q = " + q);
        if(p < q){ //这里是判断了大小
            temp = q;
            q = p;
            p = temp;
        }
        if( (p % q) == 0) return q;
        return Euclid(q,(p % q)); //每次递归都是从新设定的p和q的值。
    }
    public static void main(String[] args) {
        System.out.println("result: " + Euclid(105, 24));
        System.out.println("result: " + Euclid(1111111, 1234567));
        System.out.println("result: " + Euclid(6, 5));
    }

}
