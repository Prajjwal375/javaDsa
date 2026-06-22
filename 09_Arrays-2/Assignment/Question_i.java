// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// import java.util.*;

// public class Question_i {

//     public static void main(String[] args) {
//         int nums[] = new int[nums.length];

//         Scanner sc = new Scanner(System.in); 
//         for(int i=0; i<nums.length; i++) {
//             nums[i] = sc.nextInt();
//         }

//         for( int i=0; i<nums.length; i++ ) {
//             for( int j=i+1; j<nums.length; j++ ) {
//                 if(nums[i] == nums[j]) {
//                     return true;                
//             }
//         }

//     }
//     return false;
// }
// }


import java.util.*;

public class Question_i {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // declare array
        int nums[] = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // call function
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    // brute force method
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // duplicate found
                }
            }
        }
        return false; // all elements are distinct
    }
}
