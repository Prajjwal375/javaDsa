// Delete N Nodes after m nodes of a linked list\
// Sample Input M=2 N=2  LL: 1-2-3-4-5-6-7-8 
// output  1-2-5-6

public class DeleteMN {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Delete(Node head, int M, int N ) {
        if(head == null || M == 0) {
            return null;
        }
        if(N == 0) {
            return head;
        }
        Node temp = head;
        // Traverse
        while(temp != null) {
            // for m nodes
            for(int i=1; i<M && temp!=null; i++) {
                temp = temp.next;
            }

            // If end reached
            if (temp == null) {
                break;
            }

            // delete n nodes
            for(int i=1; i<=N && temp.next!= null; i++) {
                temp.next = temp.next.next;
            }
            // move to next valid node
             temp = temp.next;
        }
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
    
    public static void main (String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        printList(head);
        
        int M = 2;
        int N = 2;
        printList(Delete(head, M, N ));
    }
}