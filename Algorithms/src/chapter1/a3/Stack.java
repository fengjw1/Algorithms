package chapter1.a3;

import java.util.Iterator;

public class Stack<Item> implements Iterator<Item> {

    private Node first;//stack top
    private int N;//element count

    //define the nested class of Node
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null; // or N == 0;
    }

    public int size(){
        return N;
    }

    //push
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N ++;
    }

    //pop
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N --;
        return item;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Item next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
