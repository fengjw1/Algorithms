package chapter1.a3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;
public class Example1309 {

    private static void getResult(String[] inputs){

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        for (String input : inputs) {
            //push ops
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                ops.push(input);
            } else if (input.equals(")")) {
                if (ops.isEmpty()) {
                    StdOut.println("ops.isEmpty()!");
                    return;
                }
                if (vals.isEmpty()) {
                    StdOut.println("vals.isEmpty()");
                    return;
                }
//
                Double temp2 = vals.pop();
                Double temp1 = vals.pop();
                String opt = ops.pop();
                Double result = 0.0;
                if (opt.equals("+")) {
                    result = temp1 + temp2;
                } else if (opt.equals("-")) {
                    result = temp1 - temp2;
                } else if (opt.equals("*")) {
                    result = temp1 * temp2;
                } else if (opt.equals("/")) {
                    result = temp1 / temp2;
                } else {
                    StdOut.println("the option " + opt + " is Error!");
                    return;
                }
                vals.push(result);

            } else { // push vals
                Double val = Double.parseDouble(input);
                vals.push(val);
            }
        }
        StdOut.println(vals.pop());
    }

    private static void showString(String[] inputs){
        Stack<String> ops = new Stack<>();
        Stack<String> data = new Stack<>();

        for (String input : inputs){
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")){
                ops.push(input);
            }else if (input.equals(")")){
                if (ops.isEmpty()){
                    StdOut.println("ops is Empty!");
                    return;
                }
                if (data.isEmpty()){
                    StdOut.println("data is Empty!");
                    return;
                }
                String data1 = data.pop();
                String data2 = data.pop();
                String opt = ops.pop();
                data.push("(" + data2 + opt + data1 + ")");

            }else {
                data.push(input);
            }
        }

        StdOut.println(data.pop());

    }


    public static void main(String [] args){

        String[] inputs = StdIn.readAllStrings(); //元素之间要加空格，ctrl+d结束输入
        getResult(inputs);
        //
        showString(inputs);
    }
}
