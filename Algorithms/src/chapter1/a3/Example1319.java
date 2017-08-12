package chapter1.a3;

public class Example1319 {

    private class Node{
        int item;
        Node next;
    }

    private Node first;

    private void deleteLastNode(){
        Node current = first;
        if (current == null) return;

        Node next = current.next; //如果next为空，那么就只有一个first存在，所以直接first为空就可以了
        if (next == null)
            first = null;

        while (next.next != null){
            current = next;
            next = next.next;
        }

        current.next = null; // 这里为什么不能够直接写 next = null;
                            //  因为next = null 并不意味着 current 访问不到 current.next,还是可以的，
                            //  所以要写为 current.next = null, 这样才能保证删除最后一个节点

    }

}
