package chapter1.a3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class Parentheses {
    public static void main(String [] args){
        edu.princeton.cs.algs4.Stack<String> stringStack = new Stack<>();
        String str = StdIn.readString();

        String[] inputs = str.split(""); //converts a string to an array of characters

        for (String input : inputs){
            if (input.equals("{") || input.equals("[") || input.equals("(")){
                stringStack.push(input);
            }else if (!stringStack.isEmpty()){
                if (input.equals("}")){
                    if (!stringStack.pop().equals("{")){ //here we have one pop operation, so now we stack less one elements
                        StdOut.println("'{' is not equals '}'!");
                        return;// finish circulation
                    }else {
                        StdOut.println("{}");
                    }
                }else if (input.equals("]")){
                    if (!stringStack.pop().equals("[")){
                        StdOut.println("'[' is not equals ']'!");
                        return;
                    }else {
                        StdOut.println("[]");
                    }
                }else if (input.equals(")")){
                    if (!stringStack.pop().equals("(")){
                        StdOut.println("'(' is not equals ')'!");
                        return;
                    }else {
                        StdOut.println("()");
                    }
                }
            }else {
                StdOut.println("Stack<String> is empty!");
                return;
            }

        }

        StdOut.println("stringStack is size : " + stringStack.size());

    }
}
