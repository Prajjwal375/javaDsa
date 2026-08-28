/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
     return BST(preorder, Integer.MAX_VALUE);
    }
    public TreeNode BST(int[] arr, int max){
        // base case
        if(i == arr.length || arr[i] > max){
            return null;
        }
        TreeNode root = new TreeNode(arr[i]);
        i++;

        root.left = BST(arr, root.val);
        root.right = BST(arr, max);
        return root;
    }
}