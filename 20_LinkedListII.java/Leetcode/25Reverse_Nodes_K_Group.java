

//25. Reverse Nodes in k-Group

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 

// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         // check at leat k nodes
//         ListNode temp = head;
//         for(int i = 0; i< k; i++) {
//             if(temp ==  null) return head;
//             temp = temp.next;
//         }

//         //  reverse first k node
//         ListNode prev = null;
//         ListNode curr = head;
//         for(int i = 0; i< k; i++) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         // recursive update -> reversing remaining list
//         head.next = reverseKGroup(curr, k);
        
//         return prev;
//     }
// }


