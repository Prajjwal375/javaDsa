public class Linkedlist{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//  detect a cycle in linked list
public static boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while(fast!= null && fast.next != null) {
        slow = slow.next;
        fast  = fast.next.next;
        if(slow == fast) {
            return true; // cycle exists
        }
    }
    return false;  
}

public static void removeCycle() {
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow) {
            cycle =  true;
            break;
        }
    }
     if(cycle == false ) {
        return;
     }
    //find meeting point
    slow = head;
    Node prev = null; //last node
    while(slow != fast) {
    prev = fast;
    slow = slow.next;
    fast = fast.next;
    }
    //remove cycle
    prev.next = null;
}


//  Remove a cycle in linked list
    public static void main(String args[]) {
       
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = temp;
        //1-> 2-> 3->4->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
    }
}