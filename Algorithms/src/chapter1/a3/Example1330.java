package chapter1.a3;

/**
 * Created by fengjw on 2017/8/13
 * Code Change The World!
 */

public class Example1330 {
    private class Node{
        int item;
        Node next;
    }

    private Node reverse(Node x){
        Node first = x;
        Node reverse = null;
        while (first != null){
            Node second = first.next; // first.next(the Next Node ) need save as a Node
            first.next = reverse; // connected with the new LinkedList by the first.next
            reverse = first; // change the reverse position
            first = second; // move one Node of the LinkedList
        }
        return reverse;
    }
}
