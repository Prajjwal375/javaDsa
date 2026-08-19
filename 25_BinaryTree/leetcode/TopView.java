class Solution {
    public List<Integer> topView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> hd = new LinkedList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        q.add(root);
        hd.add(0);

        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {

            TreeNode curr = q.remove();
            int currHD = hd.remove();

            // First node at this horizontal distance
            if (!map.containsKey(currHD)) {
                map.put(currHD, curr.val);

                min = Math.min(min, currHD);
                max = Math.max(max, currHD);
            }

            if (curr.left != null) {
                q.add(curr.left);
                hd.add(currHD - 1);
            }

            if (curr.right != null) {
                q.add(curr.right);
                hd.add(currHD + 1);
            }
        }

        // Left to right
        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}