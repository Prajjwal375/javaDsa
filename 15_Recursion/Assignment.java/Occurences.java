import java.util.*;
public class Occurences {
    // 
    public static void allOccurrence(int arr[], int i, int key) {
        // base case
        if( i == arr.length) {
            return ;
        }
        // kaam
        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        //inner call
        allOccurrence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
       allOccurrence(arr, 0, 2);
    }
}