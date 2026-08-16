class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findsum(ans, candidates, 0, target, new ArrayList<>());
        return ans;
    }
    public static void findsum( List<List<Integer>> ans, int[] candidates, int i, int target, List<Integer>curr ){
        // base case
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || i == candidates.length){
            return;
        }

        // take choice
        curr.add(candidates[i]);
        findsum(ans, candidates, i+1, target-candidates[i], curr);


        // backtracking
        curr.remove(curr.size()-1);

        while(i+1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }

        findsum(ans, candidates, i+1, target, curr);


    }
}