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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> level = new ArrayList<>();


        if(root == null){
            return ans;
        }
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                ans.add(new ArrayList<>(level));
                level.clear();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                level.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }

        for(int i = 0; i< ans.size(); i++){
            if(i%2 == 1){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
        
    }
}