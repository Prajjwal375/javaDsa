class Solution {
    public void sortColors(int[] nums) {
        int lp = 0, rp = nums.length-1, mid=0;
        while(mid <= rp) {
            if(nums[mid] == 0) {
                // swap with lp
                int temp = nums[lp];
                nums[lp] = nums[mid];
                nums[mid] = temp;
                lp++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            } else {
                if(nums[mid] == 2) {
                    // swap with rp
                int temp = nums[rp];
                nums[rp] = nums[mid];
                nums[mid] = temp;
                rp--;
                
                
                }
            }
        }
        
        
    }
}