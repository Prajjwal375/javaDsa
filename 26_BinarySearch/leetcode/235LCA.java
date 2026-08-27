/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // base case
    if(root == null) return null;

    if(root == p || root == q ){
        return root;
    }
    TreeNode leftLca = lowestCommonAncestor(root.left, p, q);        
    TreeNode rightLca = lowestCommonAncestor(root.right, p, q);

    // left me hi dono 
    if(rightLca == null){
        return leftLca;
    }
    // right me hi dono
    if(leftLca == null){
        return rightLca;
    }
    // ek ek dono me he
    
        return root;        
    }
}