package chapter1.a3;

public class Example1324 {
    private class Node{
        int item;
        Node next;
    }

    private Node first;

    private void deleteNodeOfFollow(Node someNode){
        Node current = someNode;
        Node next = current.next;
        if (someNode == null){
            return;
        }
        if (someNode.next == null){
            return;
        }
        someNode.next = null;
        while (current.next != null){
            current = null;
            current = next;
            next = next.next;
        }
        current = null; //最后一个节点的删除
    }

}
