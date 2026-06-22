// Question 2 :
//Print out the sum of the numbers inthe second row of the nums array


// import java.util.*;

// public class Question_I {
//     public static void main(String[] args) {
//         int[][] array = { {1,4,9},{11,4,3},{2,2,3} };
//         int sum = 0;

//         for(int j = 0; j < array[1].length; j++) {
//             sum += array[1][j];
//         }

//         System.out.println(sum);
//     }
// }



//Question 3 : Write a program to Find Transpose of a Matrix
// What is Transpose?
//Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix

import java.util.*;

public class Question_II {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        for(int j=0; j<array[0].length; j++) {
            for(int i = 0; i<array.length; i++) {
                System.out.print(array[i][j] + " ");    
            }
            System.out.println();
        }
        
       

       
    }
}

