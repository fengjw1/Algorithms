package chapter1.a3;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class DoublingStackOfStrings<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int n;

    public int sieze(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void push(Item item){
        if (n == a.length) resize(2 * n);
        a[n++] = item;
    }

    public Item pop(){
        Item item = a[--n];
        a[n] = null;
        if (n > 0 && n == a.length/4) resize(a.length / 2);
        return item;
    }

    public int arraySize(){
        return a.length;
    }

    public void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i ++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public Iterator<Item> iterator(){
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item>{
        private int i = n;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[-- i];
        }

        @Override
        public void remove() {

        }
    }

    public static void main(String [] args){
        DoublingStackOfStrings<String> strings = new DoublingStackOfStrings<>();
        String[] inputs = StdIn.readAllStrings();

        //这些注释掉的原因是：split()只能分割字符串，但是输入的有空格的话就为字符串数组，所以不能分割了。
        //StdOut.println(inputs);
        //String[] inputs = str.split(" ");

//        for (String input : inputs){
//            StdOut.println(input);
//        }

//        for (int i = 0; i < inputs.length; i ++){
//            StdOut.println(inputs[i]);
//        }

        StdOut.print("Srack pop content is : ");
        for (String input : inputs){
            if (input.equals("-")){
                if (strings.isEmpty()){
                    StdOut.println("Stack overflow");
                    return;
                }
                else {
                    StdOut.print(strings.pop() + " "); //这里为什么不会改变，因为数组中存放的位置是不变的，迭代器只是改变了访问顺序
                }
            }else {
                strings.push(input);
            }
        }
        StdOut.println();
        StdOut.println("Stack size is : " + strings.arraySize());
        StdOut.print("Stack content is : ");
        for (String string : strings){
            StdOut.print(string + " ");
        }
        StdOut.println();
//        for (int i = 0; i < strings.arraySize(); i ++){
//            StdOut.println(strings.iterator().next());
//        }

        /*
        这里强调一下：返回的数组大小一定为2的倍数，不能为奇数。
         */
    }

}
