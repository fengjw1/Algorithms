package chapter1.a3;

public class Example1327 {
    private class Node{
        int item;
        Node next;
    }

    private int max(Node first){
        if (first == null){
            return 0;
        }

        Node current = first;
        Node next = current.next;
        int max = first.item;

        while (current != null && next != null){
            if (current.item < next.item){
                max = next.item;
            }
        }
        return max;
    }

}
