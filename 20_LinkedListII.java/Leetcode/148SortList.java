// / BRUTE FORCE

// class Solution {
//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next ==null) return head;

//         ArrayList<Integer>arr = new ArrayList<>();
//         ListNode temp = head;
//         while(temp != null) {
//             arr.add(temp.val);
//             temp = temp.next;
//         }
//         // sort array
//         Collections.sort(arr);
//         temp = head;
//         int i=0;
//         while(temp != null){
//             temp.val = arr.get(i++);
        
//             temp = temp.next;
//         }
//         return head;
//     }
// }


// OPTIMAL MERGER SORT PATTERN
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// class Solution {
//     public ListNode sortList(ListNode head) {
      
//       if(head == null || head.next == null) return head;
    
//     ListNode slow = head;
//     ListNode fast = head.next;
//       while(fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
//       }

//       // split
//       ListNode right = slow.next;
//       slow.next = null;

//       // sort both halve
//       ListNode left = sortList(head);
//        right = sortList(right);

//     return merge(left, right);
//     }
   

//    public ListNode merge(ListNode l1, ListNode l2) {

//     ListNode dummy = new ListNode(-1);
//     ListNode temp = dummy;

//     while (l1 != null && l2 != null) {

//         if (l1.val <= l2.val) {
//             temp.next = l1;
//             l1 = l1.next;
//         } else {
//             temp.next = l2;
//             l2 = l2.next;
//         }

//         temp = temp.next;
//     }

//     if (l1 != null)
//         temp.next = l1;

//     if (l2 != null)
//         temp.next = l2;

//     return dummy.next;
// }
// }

