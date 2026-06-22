import java.util.*;

public class IntersectionLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node IntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }


        // BRUTE FORCE TC- O(m*n)

        // while (headB != null) {
        //     Node temp = headA;
        //     while (temp != null) {
        //         if (temp == headB) {
        //             return headB;
        //         }
        //         temp = temp.next;
        //     }
        //     headB = headB.next;
        // }
        // return null;


        // TWO POINTER APPROACH TC - O(M+N)
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;


    }

    public static void main(String args[]) {

        // Common
        Node common = new Node(6);
        common.next = new Node(7);

        // LL 1
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        // LL 2
        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = common;

        Node intersection = IntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection node: " + intersection.data);
        } else {
            System.out.println("null");
        }
    }
}
