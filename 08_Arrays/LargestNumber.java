import java.util.*;
public class LargestNumber {

    public static int LargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // - infinity
        for(int i=0; i<numbers.length; i++) {
            if( largest < numbers[i] ) {
                largest = numbers[i];       
        }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16 };
        
        int largest = LargestNumber(numbers);
        System.out.println("Largest number is: " + largest);    

        
    }
 
}