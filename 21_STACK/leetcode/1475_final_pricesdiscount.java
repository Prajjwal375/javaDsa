

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int n = prices.length;
        int[] ans = new int[prices.length];

        for(int i=n-1; i>=0; i--){
        while(!s.isEmpty() && prices[s.peek()] > prices[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ans[i] = prices[i];
        }else {
            ans[i] = prices[i]-prices[s.peek()];
        }
        s.push(i);         
        }
        return ans;   
    }
}