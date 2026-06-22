import java.util.LinkedList;
class mergeSortLL {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node merge(Node head1, Node head2) {

        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null) {

            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }


   public static void main(String args[]) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(4);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(3);

    ll.print();

    ll.head = ll.mergeSort(ll.head);

    ll.print();
}
}