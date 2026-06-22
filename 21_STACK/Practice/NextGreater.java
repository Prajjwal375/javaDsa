// Time complexity O(n)

import java.util.*;

public class NextGreater {
    public static void nextGreater(int arr[], int nxtgrt[]) {
         Stack<Integer> s  = new Stack<>();
            // outerloop
         for(int i= arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nxtgrt[i] = -1;
            } else {
                nxtgrt[i] = arr[s.peek()];
            }
            s.push(i);
         }

         for(int i = 0 ; i<nxtgrt.length; i++) {
            System.out.print(nxtgrt[i] + " ");
         }

    }
   

    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        int nxtgrt[] =  new int[arr.length];
        nextGreater(arr, nxtgrt);

    }

    // next Greater Right
    // next Greater left 
    // next Smaller left 
    // next Smaller left 
}   