package chapter1.a3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * Created by fengjw on 2017/8/14
 * Code Change The World!
 */

public class Deque<Item> implements Iterable<Item> {

    public Node first;
    public Node last;
    public int size = 0;

    public class Node{
        Item item;
        Node prev;
        Node next;
    }

    public Deque(){

    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return 0;
    }

    public void pushLeft(Item item){

    }

    public void pushRight(Item item){

    }

    public Item popLeft(){
        return null;
    }

    public Item popRight(){
        return null;
    }


    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
