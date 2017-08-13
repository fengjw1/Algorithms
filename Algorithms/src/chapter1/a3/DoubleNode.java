package chapter1.a3;

/**
 * Created by fengjw on 2017/8/13
 * Code Change The World!
 */

public class DoubleNode<Item> {

    private int size = 0;

    private static class Node<Item>{
        Item item;
        Node<Item> prev; // previous
        Node<Item> next;

        public Node(Node<Item> prev, Node<Item> next, Item item){
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<Item> first;
    private Node<Item> last;

    private DoubleNode(){
        first = last = null;
    }

    /**
     * add Node at the LinkedList of the first
     */
    public void linkFirst(Item item){
        final Node<Item> f = first;
        Node<Item> node = new Node<>(null, f, item); //attention here!
        first = node;
        if (f == null){ //the LinkedList is null
            last = node;
        }else {
            f.prev = node;
        }
        size ++;
    }

    /**
     * add Node at the LinkedList of the last
     */
    public void linkLast(Item item){
        final Node<Item> l = last; // l: last
        Node<Item> node = new Node<>(l, null, item); //attention here!
        last = node;
        if (l == null){
            first = node;
        }else {
            l.next = last;
        }
        size ++;
    }

    /**
     *remove the Node at the first of the LinkedList
     */
    public Item removeFirst(){
        if (first == null){
            last = null;
            return null;
        }else {
            final Node<Item> f = first;
            final Node<Item> next = f.next;
            Item item = f.item;
            first = next;
            if (next == null){
                last = null;
            }else {
                first.prev = null;
            }
            size --;
            return item;
        }
    }

    /**
     * remove the Node at the last of the LinkedList
     */
    public Item removeLast(){
        if (last == null){
            first = null;
            return null;
        }else {
            final Node<Item> l = last;
            final Node<Item> prev = last.prev;
            Item item = l.item;
            last = prev;
            if (prev == null){
                first = null;
            }else {
                last.next = null;
            }
            size --;
            return item;
        }
    }

    /**
     * insert Node at the anywhere of the LinkedList
     * @param x
     * @param item
     * @return
     */
    public boolean insertNode(Node x, Item item){
        Node<Item> current = x;
        Node<Item> next = current.next;
        if (current == null){
            return false;
        }
        Node<Item> newNode;
        if (next == null){
            newNode = new Node<>(current, null, item);
            size ++;
        }
        newNode = new Node<>(current, next, item);
        size ++;
        return true;
    }

    /**
     * remove Node at the anywhere of the LinkedList
     * @param item
     * @return
     */
    public boolean removeNode(Item item){

        if (item == null){
            for (Node<Item> n = first; n != null; n = n.next){
                unLink(n);
                return true;
            }
        }else {
            for (Node<Item> n = first; n != null; n = n.next){
                if (item.equals(n.item)){
                    unLink(n);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * disconnect node from the LinkedList
     * @param node
     */
    public void unLink(Node<Item> node){
        final Node<Item> prev = node.prev;
        final Node<Item> next = node.next;

        if (prev == null){
            first = next;
        }else {
            prev.next = next; //this
            node.next = null;
        }

        if (next == null){
            last = prev;
        }else {
            next.prev = prev; //this
            node.next = null;
        }
    }

}
