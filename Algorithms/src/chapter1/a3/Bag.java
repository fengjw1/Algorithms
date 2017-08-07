package chapter1.a3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private int N;
    private Node first;
    private class Node{
        Item item;
        Node next;
    }

    //
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    private class ListIterator implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void remove() {

        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
