/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */
// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         ListNode sdummy = new ListNode(0);
//         ListNode ldummy = new ListNode(0);

//         ListNode small = sdummy;
//         ListNode large = ldummy;
//         ListNode curr =  head;

//         while(curr != null) {
//             // ListNode next = curr.next;
            
//             if(curr.val < x) {
//                 small.next = curr;
//                 small = small.next;
//             } else {
//                 large.next = curr;
//                 large = large.next;
//             }
//             curr = curr.next;
//         }
//         large.next = null;
//         small.next = ldummy.next;

//         return sdummy.next;       
//     }
// }