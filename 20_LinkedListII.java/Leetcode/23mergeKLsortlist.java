// priority queue

// import java.util.*;

// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
//         for (ListNode node : lists) {
//             if (node != null) {
//                 pq.offer(node);
//             }
//         }

//         ListNode dummy = new ListNode(-1);
//         ListNode tail = dummy;

//         while (!pq.isEmpty()) {
//             ListNode node = pq.poll();
//             tail.next = node;
//             tail = tail.next;

//             if (node.next != null) {
//                 pq.offer(node.next);
//             }
//         }

//         return dummy.next;
//     }
// }

// divde and conquer

// class Solution {

//     public ListNode mergeKLists(ListNode[] lists) {

//         if (lists == null || lists.length == 0)
//             return null;

//         return divide(lists, 0, lists.length - 1);
//     }

//     public ListNode divide(ListNode[] lists, int left, int right) {

//         if (left == right)
//             return lists[left];

//         int mid = left + (right - left) / 2;

//         ListNode l1 = divide(lists, left, mid);
//         ListNode l2 = divide(lists, mid + 1, right);

//         return merge(l1, l2);
//     }

//     public ListNode merge(ListNode l1, ListNode l2) {

//         ListNode dummy = new ListNode(-1);
//         ListNode temp = dummy;

//         while (l1 != null && l2 != null) {

//             if (l1.val <= l2.val) {
//                 temp.next = l1;
//                 l1 = l1.next;
//             } else {
//                 temp.next = l2;
//                 l2 = l2.next;
//             }

//             temp = temp.next;
//         }

//         if (l1 != null)
//             temp.next = l1;

//         if (l2 != null)
//             temp.next = l2;

//         return dummy.next;
//     }
// }