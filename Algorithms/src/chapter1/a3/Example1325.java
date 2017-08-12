package chapter1.a3;

public class Example1325 {
    private class Node{
        int item;
        Node next;
    }

    private void insertAfter(Node insertOne, Node insertTwo){
        Node current = insertOne;
        Node next = current.next;

        if (insertOne == null || insertTwo == null){
            return;
        }
        insertTwo.next = insertOne.next;
        insertOne.next = insertTwo;
    }

}
