// LinkedList

class Node{
    public int val;
    public Node next;
    public Node prev;

    public Node(int val,Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev= prev;
    }
}

class MyCircularDeque {
    Node head;
    Node rear;
    int size;
    int capacity;


    public MyCircularDeque(int k) {
        size = 0;
        capacity = k;
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(head == null){
            // first element
            head = new Node(value,null,null);
            rear = head;
        }else {
            Node newHead = new Node(value,head,null);
            head.prev = newHead;
            head = newHead;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
      if(isFull()) return false;
        if(head == null){
            // first element
            head = new Node(value,null,null);
            rear = head;
        }else {
            Node newHead = new Node(value,null,rear);
            rear.next = newHead;
            rear = rear.next;
        }
        size++;
        return true;   
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(size == 1){
            head = null;
            rear = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(size == 1){
            head = null;
            rear = null;
        }else{
            rear = rear.prev;
            
        }
        size--;
        return true;
        
    }
    
    public int getFront() {
        if (isEmpty()) return -1;
        return head.val;
    }
    
    public int getRear() {
     if (isEmpty()) return -1;
        return rear.val;   
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

//Time Complexity: O(1)

// Because we maintain access to the front and rear elements at all times, all operations simply involve pointer manipulations that take O(1) time.

// Space Complexity: O(k)

// In the worst case, there will be maximum k nodes in our doubly linked list, which will involve instantiating k node objects and thus take O(k) space.




// Using array
class MyCircularDeque {

    int[] array;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        array = new int[k];
        size = 0;
        capacity = k;
        front = 0;
        rear = k - 1;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        array[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        array[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return array[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return array[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}