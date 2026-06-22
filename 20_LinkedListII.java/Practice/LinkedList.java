public class LinkedList{
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

    // Methods

    // Add in first
    public static void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        newNode.next = head; // Link

        head = newNode; // head update

    }

    // Add in last
    public static void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        
        tail = newNode;
    }
     

     // add in middle
     public static void middleAdd(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1) {
        temp = temp.next;
        i++;
        }

        // i = idx-1 temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
     }
     
     public static int removeFirst() {
        
        if(size==0) {
            System.out.println("LL is empty");
             return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        size--;

        int val = head.data;
        head = head.next;
        return val;
     }

     public static void printll() {
        if(head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
     }

        // remov at last position
     public int removeLast() {
        if(size == 0) {
             System.out.println("LL is empty");
             return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }


     // iterative search O(n)
     public static int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp!= null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
     }


     // Search Recursion // O(n)
     public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx + 1; 
     }
     public int recSearch(int key) {
        return helper(head, key);
     }



     /// Reverse a Linked List   it is imp
     ///  3 variable 4-index
     ///
     public void reverse() {
        Node prev = null;
        Node curr = tail = head; 
        Node next;

        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     }



     //////   Delete nth node from end
     ///        nth end = (Size-n+1) start
     //
    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next;  // if removeing head
        }

        //sz-n
        int i = 1;
        int k = sz-n;
        Node prev = head;

        while(i < k) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }



    /// Palindrome
    ///  SLow-fast
public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
        slow = slow.next; // +1
        fast = fast.next.next; //+2
    }
    return slow; // SLOW IS MY MIDNODE
}

public boolean checkPalindrome() {
    if(head == null || head.next!= null) {
        return true;
    }
    // step1 - find mid
    Node midNode = findMid(head);
    // step2 = reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr!= null) {
        next =curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
        Node right = prev; // right half head
        Node left  = head ; // left half head

    // step3 = check left and right half
    while(right != null) {
        if(left.data != right.data) {
            return false; 
        }
        left = left.next;
        right  = right.next;
    }
    return true;
}



////    ZIG - ZAG linked list
///
/// 

public void zigZag() {
    // find mid
     Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverese 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next ;

        while( curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev ; 
        Node nextL , nextR;

        // alt merge - zigzag
        while(left != null && right !=null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        } 
}
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.printll();

        ll.zigZag();
        ll.printll();
        
    }
}