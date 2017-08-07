package chapter1.a3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private int N = 0;
    private Node first;
    private Node last;
    private class Node{
        Item item;
        Node next;
    }
    //
    public boolean isEmpty(){
        return N == 0; // or first == 0
    }

    //
    public int size(){
        return N;
    }

    public void enqueue(Item item){ // add elements at the end of the table
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        N ++;
    }

    public Item dequeue(){ // delete the element on the header
        Item item = first.item;
        first = first.next;
        if (isEmpty()) first = last;
        N --;
        return item;
    }

}
