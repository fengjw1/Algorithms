package chapter1.a3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by fengjw on 2017/7/31.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap){
        a =(Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

    public Item[] getA(){
        return a;
    }

    public static void main(String[] args) {
        //P82
        FixedCapacityStack<String> s ;
        s = new FixedCapacityStack<>(100);
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
        Object[] temp = s.getA(); //这里要使用Object对象。
        for (int i = 0; i < s.size(); i ++){
            StdOut.print(temp[i] + " ");
        }
        StdOut.println();
        StdOut.println("(" + s.size() + " left on stack)");
    }

}
