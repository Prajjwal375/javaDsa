import java.util.*;

public class MergeKsorted {
    static class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }

    public static Node merge(Node l1, Node l2) {
        Node temp = new Node(0);
        Node tail = temp;

        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // remaining node
        if(l1 != null) tail.next = l1;
        if(l2 != null) tail.next = l2;

        return temp.next;
    }


    public static Node mergeKlist(Node[] lists) {
        // if list is empty check
        if(lists.length == 0) {
            return null;
        }
        Node result = lists[0];

        for(int i = 1; i< lists.length; i++) {
            result = merge(result, lists[i]);
        }
         return result;
    }

     public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node l1 = new Node(1);
        l1.next = new Node(3); 

        Node l2 = new Node(6);
        l2.next = new Node(8); 

        Node l3 = new Node(9);
        l3.next = new Node(10);

        printList(l1);
        printList(l2);
        printList(l3);

        Node[] lists = {l1, l2, l3};
        Node result = mergeKlist(lists);
        printList(result);
        


    }
}