class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        findPermutation(nums,used, new ArrayList<>(),ans);
        return ans;
    }
    public void findPermutation(int[] nums, boolean[] used,List<Integer> curr,  List<List<Integer>> ans){
        // base case
    if(curr.size() == nums.length){
        ans.add(new ArrayList<>(curr));
        return;
    }
    // select 1 and call for others
    for(int i =0; i< nums.length; i++){

        if(used[i]){
            continue;
        }
        // choose
        used[i] = true;
        curr.add(nums[i]);


        // explore
        findPermutation(nums, used, curr, ans);

        // backtrack
        curr.remove(curr.size()-1);
        used[i] = false;
    }
    }
}