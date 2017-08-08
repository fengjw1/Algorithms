package chapter1.a3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Example1305 {
    //private static int N = 50;
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        int N = StdIn.readInt();
        while (N > 0){
            stack.push(N % 2);
            N /= 2;
        }
        /*
        写法一
         */
//        for (int d : stack){
//            StdOut.print(d);
//        }


        /*
        写法二
         */
        //int d = 0;
        int n = stack.size();
        //for(int i = 0; i < stack.size(); i ++){ 如果这里第二个参数为stack.size（）
        // 的话，他是一直会发生改变的，会随着pop（）操作越来越小。
        for (int i = 0; i < n; i ++){
            StdOut.print(stack.pop());
        }

        StdOut.println();
    }
}
