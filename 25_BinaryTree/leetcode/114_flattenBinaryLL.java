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

// My approach O(n) time and O(n) space
class Solution {
    List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {

        preorder(root);

        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);

            node.left = null;

            if (i + 1 < list.size()) {
                node.right = list.get(i + 1);
            } else {
                node.right = null;
            }
        }
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root);

        preorder(root.left);
        preorder(root.right);
    }
}