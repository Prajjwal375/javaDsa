public class DoubleLL {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

// addd
public void addFirst(int data) {
    Node newNode = new Node(data);
    if(head == null) {
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;

}

// remove 
public int removeFirst() {
    if(head == null) {
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }

    if(size == 1) {
        int val = head.data;
        head = tail = null;
        size--;
        return val;

    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
}

// reeverse a doubly linked list

public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;

    while(curr != null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
}

// print

public void print() {
    Node temp = head;
    while(temp != null){ 
    System.out.print(temp.data + "<->");
    size++;
    temp = temp.next;

    }
    System.out.println("null");
    
}

public static void main(String args[]) {
    DoubleLL dll = new DoubleLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.print();
    System.out.println(size);
    //dll.removeFirst();
    dll.reverse();
    dll.print();

}
}