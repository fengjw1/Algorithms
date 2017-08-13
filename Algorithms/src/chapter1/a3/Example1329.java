package chapter1.a3;

/**
 * Created by fengjw on 2017/8/13
 * Code Change The World!
 */

public class Example1329<Item> { //circle queue

    private Node last;

    private class Node{
        Item item;
        Node next;

        public Node(Item item){
            this.item = item;
        }
    }

    /**
     * enqueue operation
     */
    public void enqueue(Item item){
        Node node = new Node(item);
        if (last == null){
            last = node;
            last.next = last;
        }else {//cycle
            Node origin = last.next;
            last.next = node;
            node.next = origin; // origin is the first Node

            last = node; // by the 'last' point to the last Node
        }
    }

    /**
     * dequeue operation
     */
    public Item dequeue(){
        if (last == null){
            throw new NullPointerException("queue is empty!");
        }
        Node first = last.next;

        if (first == last){
            last = null; // '@Important'
        }else {
            last.next = first.next;
        }
        return first.item; // or last.next.item? Error!
                            // Because : if LinkedList only have one Node,
                            //'last = null'; return last.next is mean return null; not get the item.
    }

}
