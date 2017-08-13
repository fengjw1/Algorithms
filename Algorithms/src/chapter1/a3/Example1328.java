package chapter1.a3;

public class Example1328 {
    private class Node{
        int item;
        Node next;
    }

    private int max(Node first, int maxItem){
        if (first == null){ //this is the last Node of the linkedList
            return maxItem;
        }

        if (maxItem < first.item){
            maxItem = first.item;
        }
        return max(first.next, maxItem);
    }

}
