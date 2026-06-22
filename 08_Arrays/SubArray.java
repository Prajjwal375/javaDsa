import java.util.*;
public class SubArray {

    public static void SubArray(int numbers[]) {
        int ts= 0;
        // outer loop
        for(int i=0; i<numbers.length; i++){
            int start = i;
            // inner loop
            for(int j=i; j<numbers.length; j++) {
                    int end = j;
                    // print subarray from start to end
                    for(int k=start; k<=end; k++) {
                        System.out.print(numbers[k] + " "); // Subarray
                    }
                    ts++;
                    System.out.println();       
                    }
                    System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16 };
        
        SubArray(numbers);
        

    }   
    }
 
