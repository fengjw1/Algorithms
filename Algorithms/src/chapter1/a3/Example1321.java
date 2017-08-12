package chapter1.a3;

public class Example1321 {
    private class Node{
        int item;
        Node next;
    }

    private Node first;

    private boolean findNodeItem(Node first, int key){
        Node current = first;
        Node next = current.next;

        if (first == null){ //judge first condition, when the Node just have one element
            return false;
        }
        if (next == null){ // judge second condition, when the Node just have two elements
            if (first.item == key){
                return true;
            }else {
                return false;
            }
        }

        while (current.next != null){// others
            if (current.item == key)
                return true;
            current = next;
            next = current.next;
        }

        if (current.item == key) return true; //this is about the condition that is the last Node !
        return false;

    }

}
