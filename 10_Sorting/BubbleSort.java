import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /// Selection sort
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while( prev >=0 && arr[prev] > curr ) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }


    // Counting Sort
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    // Count set bits in number
    public static int CountsetBits(int n) {

        int count =  0;
        while(n>0) {
            if((n & 1)! = 0) { // check LSB
                count ++;
            }
            n = n>>1;
        }
        return count ;
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
       // bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }
}



// heap sort

class Solution {

    public void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    public void heapify(int[] arr, int n, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}