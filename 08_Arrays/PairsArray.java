import java.util.*;
public class PairsArray {

    public static void PairsArray(int numbers[]) {
        // outer loop
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+numbers[i]+", "+numbers[j]+") ");
        }
        System.out.println();
        
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16 };
        
        PairsArray(numbers);
        

    }   
    }
 
