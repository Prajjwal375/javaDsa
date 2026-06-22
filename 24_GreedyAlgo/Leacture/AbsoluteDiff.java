import java.util.*;
 // O(nlogn)
public class AbsoluteDiff {
    public static void main(String args[]) {
        int A[] = {4, 1, 8, 7};
        int B[]  = {2, 3, 6, 5};
        // time complexity of sorting O(nlogn)
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        //O(n)
        for(int i=0; i<A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute diff:"+ minDiff);
    }
}