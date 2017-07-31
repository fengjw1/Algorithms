package chapter1.a3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/31.
 */
public class FixedCapacityStackOfStrings {
    private String[] a; //stack entries
    private int N; //size
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(String item){
        a[N++] = item; //if use push() method, the parameter N will plus one    ****    N = N + 1;
    }
    public String pop(){
        return a[--N];
    }
    public String[] getA(){
        return a;
    }




    public static void main(String[] args) {
        //P82
        FixedCapacityStackOfStrings s ;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()){
            String item = StdIn.readString(); //回车键结束
            if (!item.equals("-")){
                s.push(item);
            }else if (!s.isEmpty()){
                StdOut.print(s.pop() + " ");
            }
        }

        /*
        下面这里是输出栈中的内容的。
         */
        String[] temp = s.getA();
        for (int i = 0; i < s.size(); i ++){
            StdOut.print(temp[i] + " ");
        }
        StdOut.println();
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
