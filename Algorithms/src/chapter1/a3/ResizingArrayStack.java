package chapter1.a3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1]; // initialize the array size is one
    private int N = 0; // element

    //
    public boolean isEmpty(){
        return N == 0;
    }

    //
    public int size(){
        return N;
    }

    //move the stack to the array of the same size
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < max; i ++){
            temp[i] = a[i];
        }
        a = temp; // the array 'a' get the array 'temp' physical address
    }

    //add the element to the top of the stack
    public void push(Item item){
        if (N == a.length) resize(a.length * 2);
        a[N++] = item;
    }

    //remove the element to the top of the stack
    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length /4);
        return item;
    }

    //Template
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<Item>{

        private int i = N;


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
}
