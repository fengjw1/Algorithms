package chapter1.a1;

/**
 * Created by fengjw on 2017/7/6.
 */
public class Test {
    public static void main(String [] args){
        //1.1.5
        //System.out.println("1.1.5 :" + Example1105.isRight());

        //1.1.6
        //Example1106.Result();

        //1.1.9
        //Example1109.test();
        int[] a = new int[10];
        for(int i = 0; i < 10; i ++){
            a[i] = 9 - i;
        }
        for(int i = 0; i < 10; i ++){
            a[i] = a[a[i]];
            System.out.println(a[i]);
        }
        for(int i = 0; i < 10; i ++){
            //System.out.println(i);
        }
    }
}
