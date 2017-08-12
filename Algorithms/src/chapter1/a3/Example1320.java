package chapter1.a3;

public class Example1320 {
    /*
    删除第k个元素的思路：就是循环k次，找到第k个元素，并知道k-1个元素，将k+1个元素传给第k-1
    个元素，跳过第k个元素

    同时需要考虑k的情况
     */

    private class Node{
        int item;
        Node next;
    }

    private Node first;

    private void deleteNodeOfNumber(int k){

        if (k <= 0) return;
        if (k == 1) {
            first = first.next;
            return;
        }


        Node current = first;

        Node next = current.next;

        for (int i = 0; i < k - 1; i ++){ //这里是k > 1的情况
            current = next;
            next = current.next;
        }

        //执行完循环之后，current 为k-1的值,next 为k的值，这个时候只要使得next指向第k+1的只就可以了.
        next = next.next;
        current.next = next;
    }

}
