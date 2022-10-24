package Playground.com.me.src;

public class LLNode {
    private double data;
    private LLNode next;
    
    LLNode(double data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(LLNode nextNode) {
        this.next = nextNode;
    }

    public LLNode getNext() {
        return this.next;
    }

    public String toString() {
        String hasNextText = next != null ? " and has next node." : " and doesn't have next node.";
        return "This node has data " + data + hasNextText;
    }
}
