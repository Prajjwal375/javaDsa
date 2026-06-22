//Question 4:Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]Output:   6 Explanation:The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped

import java.util.*;
public class Question_iv {
    public static int Trappedwater(int[] height) {
        int n =  height.length;
        // left max boundary
        int leftMax[]  = new int[n];
        leftMax[0] = height[0];
        for( int i=1; i<n; i++ ) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for( int i=n-2; i>=0; i-- ) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0; i<n; i++) {
            // water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]); 
            // trapped water
            trappedWater += waterLevel - height[i];
    }
    return trappedWater;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        //input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the height of bars: ");
        int height[] = new int[n];
        // input array elements
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();

        }
        System.out.println("Trapped water is :" + Trappedwater(height));
    }
}