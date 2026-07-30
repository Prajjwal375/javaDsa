class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans  = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = i+1;
        }
        Combinations(ans, arr, 0, new ArrayList<>(), k);
        return ans;
    }

    public static void Combinations(List<List<Integer>>ans, int[] arr, int i, List<Integer>curr ,int k){
        // base case
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        if(i == arr.length){
            return;
        }
        // yes choice
        curr.add(arr[i]);
        Combinations(ans, arr, i+1, curr, k);

        // backtracking
        curr.remove(curr.size()-1);

        // No choice
        Combinations(ans, arr, i+1, curr, k);
    }
}