package chapter1.a1;

import edu.princeton.cs.algs4.StdIn;


/**
 * Created by fengjw on 2017/7/6.
 */
public class Example1103 {

    public static void main(String [] args){
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if(a == b && b == c){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


    }
}
