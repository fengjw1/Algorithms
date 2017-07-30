package chapter1.a3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//
//import java.util.Stack;


/**
 * Created by fengjw on 2017/7/30.
 * 这里使用第三方包的Stack方法，不然无法实现
 */
public class Reverse {
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            stack.push(StdIn.readInt());
        }

        for (int i : stack){
            StdOut.println(i);
        }
        for (int i : stack){
            StdOut.println(i);
        }

//        for (int i = 0; i < stack.size(); i ++){
//            StdOut.println(stack.pop());
//        }
    }
}
