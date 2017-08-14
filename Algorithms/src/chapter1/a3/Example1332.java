package chapter1.a3;

import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * Created by fengjw on 2017/8/14
 * Code Change The World!
 */

public class Example1332<Item> implements Iterable<Item>{

    private Node first;
    private Node last;

    public class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(Item item){
        Node node = new Node();
        node.item = item;
        node.next = null;
        if (isEmpty()){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
    }


    public void push(Item item){
        Node node = new Node();
        node.item = item;
        if (isEmpty()){
            first = node;
            last = node;
            node.next = null; // clear all : first.next and last.next
        }else {
            node.next = first;
            first = node;
        }
    }

    public Item pop(){
        if (isEmpty()){
            return null;
        }else {
            Item item = first.item;
            first = first.next;
            return item;
        }
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new Iter();
    }

    public class Iter implements Iterator<Item>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    //test
    public static void main(String [] args){
        Example1332<String> steque = new Example1332<>();
        steque.enqueue("a");
        steque.enqueue("b");
        steque.enqueue("c");
        steque.enqueue("d");
        steque.push("e");
        steque.push("f");
        steque.push("g");
        //StdOut.println(steque);
        StdOut.println("---------------");
        Iterator<String> iterator = steque.iterator();
        while (iterator.hasNext()){
            StdOut.println(iterator.next());
        }
        StdOut.println("---------------");
        StdOut.println("pop up: ");
        while (!steque.isEmpty()){
            StdOut.println(steque.pop());
        }
    }


}


