package chapter1.a3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/30.
 */
public class Evaluate {
    public static void main(String [] args){
        Stack<String> ops = new Stack<>(); //操作符存放
        Stack<Double> vals = new Stack<>(); //操作数存放

        //这里要注意输入字符的方式，每次只能输入一个字符，然后回车键下一个
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString(); //输入的内容
            //StdOut.println("s = " + s);
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {//计算操作，取两个操作数和一个运算符
                String op = ops.pop(); //取出的运算符
                double v = vals.pop(); //取出的是操作数 取出的是后面一个操作数
                if (op.equals("+")) v = vals.pop() + v; //取出的是前一个操作数
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);

                StdOut.println("v = " + v);

                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s)); //并没有用，无法存入，报错为类型不一致
            }
        }
            StdOut.println(vals.pop());
    }
}
