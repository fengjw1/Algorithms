package chapter1.a3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EvaluatePostfix {

    public static void evaluatePostfix(String[] inputs){
        Stack<String> ops = new Stack<>();
        Stack<Double> data = new Stack<>();

        for (String input : inputs){
            if (input.equals("(")){
                continue;
            }else if (input.equals(")")){
                if (ops.isEmpty()){
                    StdOut.println("Stack ops is Empty!");
                    return;
                }
                if (data.isEmpty()){
                    StdOut.println("Stack data us Empty!");
                    return;
                }

                String op = ops.pop();
                Double data1 = data.pop();
                Double data2 = data.pop();
                Double result = 0.0;
                if (op.equals("+")){
                    result = data2 + data1;
                }else if (op.equals("-")){
                    result = data2 - data1;
                }else if (op.equals("*")){
                    result = data2 * data1;
                }else if (op.equals("/")){
                    result = data2 / data1;
                }
                data.push(result);
            }else if (input.equals("+") || input.equals("-")
                    || input.equals("*") || input.equals("/")){
                ops.push(input);
            }else {
                data.push(Double.parseDouble(input));
            }
        }

        StdOut.println("The Result is " + data.pop());

    }

    public static void main(String [] args){
        String [] inputs = StdIn.readAllStrings();
        InfixToPostfix.infixToPostfix(inputs);
        evaluatePostfix(inputs);
    }
}
