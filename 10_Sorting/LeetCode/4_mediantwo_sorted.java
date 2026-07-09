// 4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;

    // merge
    int arr[] = new int[n+m];
    int i=0,j=0,k = 0;
    while(i<n && j<m)
        if(nums1[i] < nums2[j]){
        arr[k++] = nums1[i++];
    }else {
        arr[k++] = nums2[j++];
    }

    while (i < n)
        arr[k++] = nums1[i++];

    while (j < m)
        arr[k++] = nums2[j++];
    
    int total = arr.length;
    if(total%2 == 1){
        return (double) arr[total/2];
    }else{
    int mid1 = arr[total/2 -1];
    int mid2 = arr[total/2 ];
    return ((double) mid1+ (double) mid2)/2.0;
    }

    }
}