
public class SwappingLL {
    static class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    

    public static Node swap( Node head,int x, int y) {
        // if both x and y are same
        if( x == y) {
            return head;
        }

        // traverse x
        Node prevX = null, currX = head;
        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // traverse y
        Node prevY = null, currY = head;
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        // if x or y is present or not
        if(currX == null || currY == null) {
            return head;
        }

        // for swap connect prevx
        if(prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        // for swap connect prevy
        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // swap
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printList(head);
        
        int x = 2;
        int y = 4;
        
         head = swap(head, x, y);
        printList(head);
        
    }
}


// If interview allow modify values

// You are given the head of a linked list, and an integer k.
// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
// Example 1:

// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]

// class Solution {

//         public static ListNode swapNodes(ListNode head, int k) {
//             if(head == null) return null;

//             ListNode first = head;
//             // for k from start
//             for( int i=1; i<k; i++) {
//                 if(first == null) return head;
//                 first = first.next;
//             }
//             ListNode start = first;

//             // k from end

//             ListNode fast = first;
//             ListNode slow = head;

//             while(fast.next!=null) {
//                 fast = fast.next;
//                 slow = slow.next;
//             }
//             ListNode end = slow;

//             // swap
//             int temp = start.val;
//             start.val = end.val;
//             end.val = temp;

//             return head;
//         }
    
// }