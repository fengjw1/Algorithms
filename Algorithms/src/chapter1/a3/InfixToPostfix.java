package chapter1.a3;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class InfixToPostfix {

    public static void infixToPostfix(String[] inputs){
        Stack<String> data = new Stack<>();
        Stack<String> ops = new Stack<>();
        for (String input : inputs){
            if (input.equals("(")){
                continue;
            }else if (input.equals(")")){
                if (data.isEmpty()){
                    StdOut.println("Stack data is Empty!");
                    return;
                }
                if (ops.isEmpty()){
                    StdOut.println("Stack ops is Empty!");
                    return;
                }

                String data1 = data.pop();
                String data2 = data.pop();
                String op = ops.pop();
                String result = data2 + data1 + op;
                data.push(result);
            }else if (input.equals("+") || input.equals("-")
                    || input.equals("*") || input.equals("/")){
                ops.push(input);
            }else {
                data.push(input);
            }
        }

        StdOut.println("the end is : " + data.pop());
    }

    public static void main (String [] args){

        String[] inputs = StdIn.readAllStrings();
        infixToPostfix(inputs);

    }
}
