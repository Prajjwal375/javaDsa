class Solution {

    public List<List<Integer>> subsets(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
    findsubset(ans, nums,0, new ArrayList<>());
    return ans;        
    }

    public static void findsubset(List<List<Integer>> ans,int[] nums, int i,  List<Integer>curr){
        // base case
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
        return;
        }
        // yes choice
        curr.add(nums[i]);
        findsubset( ans, nums, i+1, curr);

        // Backtrack codn
        curr.remove(curr.size() - 1);

        //no choice
        findsubset(ans, nums, i+1,curr);

    }
}