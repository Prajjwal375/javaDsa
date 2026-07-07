class Solution {
    public int[] sortArray(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        mergeSort(nums,si,ei);
        return nums;
    }
    public static void mergeSort(int[] nums, int si, int ei){
        if(si >= ei) return ;
        int mid = si + (ei-si)/2;
        mergeSort(nums,si,mid);//left
        mergeSort(nums,mid+1,ei); //right
        merge(nums,si,mid,ei);
    }

    public static void merge(int[] nums, int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;  // starting of left
        int j = mid+1; // starting of right;
        int k = 0; //iterator of temp

        while(i<= mid && j<= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=ei){
            temp[k++] = nums[j++];
        }
        // copy
        for(k=0, i=si; k<temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }
}