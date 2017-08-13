package chapter1.a3;

import edu.princeton.cs.algs4.StdOut;

public class Example1326 {
    private class Node{
        String item;
        Node next;
    }

    private void remove(Node first, String key){
        Node current = first;
        Node next = current.next;

        while (current.next != null){
            if (current.item == key){
                current = null;
                current = next;
                next = current.next;
            }else {
                current = next;
                next = current.next;
            }
        }

        if (current.item == key){// judge the last Node of the LinkedList
            current = null;
        }

    }

    public static void main(String [] args){
        int i = 0;
        int count = 0;
        while (i < 3){
            count ++;
            StdOut.println(count);
            i ++;
        }
    }

}
