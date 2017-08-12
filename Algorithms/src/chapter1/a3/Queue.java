package chapter1.a3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int n;
    class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return n;
    }

    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            last = first;
        }else {
            oldlast.next = last;
        }
        n ++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if (isEmpty()){
            last = null;
        }
        n --;
        return item;
    }


    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class QueueIterator implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null; //要想循环下去，对列不能为空，不为空的话就是first要不等于null.
        }

        @Override
        public Item next() { //下一个链表元素
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
