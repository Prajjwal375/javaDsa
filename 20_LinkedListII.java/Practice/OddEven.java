import java.util.*;

public class OddEven {
    static class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    public static Node head;
   

   public static Node seperateEvenOdd() {
    if(head == null )  {
        return null;
    }

    Node evenStart = null, evenEnd = null;
    Node oddStart = null, oddEnd = null;
    Node curr = head;
    while(curr!= null) {
        int val = curr.data;
        if(val % 2 == 0) {
            if(evenStart == null) {
                evenStart = curr;
                evenEnd = curr;
            } else {
                evenEnd.next = curr;
                evenEnd = curr;
            } // for odd
        } else {
             if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = curr;
        } else {
            oddEnd.next = curr;
            oddEnd = oddEnd.next;
        }
        }
        curr = curr.next;
    }  

        // connect
        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
   }
    
    

    
    void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public static void printList() {
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
        OddEven list = new OddEven();
        
        list.push(6);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(8);
        list.printList();

        list.seperateEvenOdd();
        list.printList();

        
         
        
    }
}