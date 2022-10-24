/*
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, 
 * except the number 0 itself.
*/

package Playground.com.me.src;

public class LeetAddTwo {
   public static void main(String[] args) {
    // 15782; automate this
    LLNode node1 = new LLNode(1);
    LLNode node2 = new LLNode(5);
    LLNode node3 = new LLNode(7);
    LLNode node4 = new LLNode(8);
    LLNode node5 = new LLNode(2);
    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);
    LinkedList ll1 = new LinkedList(node1);
    System.out.println(getLength(ll1));

    // 15782
    LLNode nodeA = new LLNode(3);
    LLNode nodeB = new LLNode(3);
    LLNode nodeC = new LLNode(4);
    nodeA.setNext(nodeB);
    nodeB.setNext(nodeC);
    LinkedList ll2 = new LinkedList(nodeA);
    System.out.println(getLength(ll2));
   }

   public static LinkedList addTwo(LinkedList list1, LinkedList list2) {
    int len1 = getLength(list1);
    int len2 = getLength(list2);
    // LL to ints, sum them
    
    // int to LL
    
    return null;
   }

   public static int getLength(LinkedList list) {
    LLNode next = list.getFirst();
    int i = 0;
    while (next != null) {
        next = next.getNext();
        i += 1;
    }
    return i;
   }

}
