package Playground.com.me.src;

public class LinkedList {
    private LLNode first;

    LinkedList(LLNode firstNode) {
        this.first = firstNode;
    }
    
    public void stack(LLNode node) {
        LLNode currentNode = first;
        LLNode next = first.getNext();
        while (next != null) {
            currentNode = next;
            next = next.getNext();
        }

        currentNode.setNext(node);
    }

    public void insert(LLNode node) {
        node.setNext(first);
        first = node;
    }

    public LLNode getFirst() {
        return first;
    }

    public String toString() {
        String result = "Linked List\n" + first.toString();
        LLNode next = first.getNext();
        while (next != null) {
            result += next.toString() + "\n";
            next = next.getNext();
        }

        return result;
    }
}
