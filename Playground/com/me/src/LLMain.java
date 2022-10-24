package Playground.com.me.src;

public class LLMain {
    public static void main(String[] args) {
        LLNode node1 = new LLNode(3.5);
        LLNode node2 = new LLNode(2.9);
        LLNode node3 = new LLNode(-1.5);
        LLNode node4 = new LLNode(12.5);
        LinkedList ll = new LinkedList(node1);
        System.out.println(ll.toString());
        ll.stack(node2);
        System.out.println(ll.toString());
        ll.stack(node3);
        System.out.println(ll.toString());
        ll.insert(node4);
        System.out.println(ll.toString());
    }
}
