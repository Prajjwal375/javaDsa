// 658 find k closest elements

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = floor(arr,x);
        int j = i+1;
        List<Integer> ans = new ArrayList<>();
        while(k>0 && i>=0 && j<arr.length){
            if(Math.abs(x-arr[i])<=Math.abs(x-arr[j])){
                ans.add(arr[i--]);
            }else {
                ans.add(arr[j++]);
            }
            k--;
        }
        // remaining element
        while(k>0 && i>=0){
            ans.add(arr[i--]);
            k--;
        }
        while(k>0 && j<arr.length){
            ans.add(arr[j++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    public int floor(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;
        int ans = 0;
        while(left<=right){
        int mid = left+ (right-left)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid]<x){
                    ans = mid;
                    left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return ans;
    }
}