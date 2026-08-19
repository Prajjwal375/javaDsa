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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }

        int count = 0 ;
        long sum = 0;
        
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr == null){
                Double avg = (double)sum/count;
                ans.add(avg);
                sum = 0;
                count = 0;

                if(q.isEmpty()){
                    break;
                }else q.add(null);
            }
            else{
                sum += curr.val;
                count++;
                if(curr.left!= null){
                    q.add(curr.left);
                }
                if(curr.right!= null){
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}