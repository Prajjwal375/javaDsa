public class Recursion {
    // // Print numbers from  n to 1 (decreasing order)
    public static void printDec(int n) {
        if(n == 1 ) {
            System.out.print(n+"");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

// Print numbers from  1 to n (increasing order)
    public static void printInc(int n) {
        if(n == 1 ) {
            System.out.print(n+"");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // factorial no.
    public static int factorial(int n) {
    if(n == 0 || n==1) {
        return 1;
    }
    
    return  n * factorial(n-1);
    
    }

    /// sum 0f first n natural number
///

public static int calcSum(int n) {
    if(n ==1) {
        return 1;
    }
    int sum = n + calcSum(n-1);
    return sum;
}


    /////   fibonacci number
    ///
    public static int Fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fib = Fibonacci(n-1) + Fibonacci(n-2);
        return fib;
    }


    // check the array iss sorted or not
    public static boolean isSorted(int arr[], int i) {
        if( i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }


// Write to find the first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i ) {
        if( i ==  arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }


// Write to find the last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i ) {
        if( i ==  arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    // print x^n // time complexit  O(n)
    public static int power(int x, int n) {
        if(n == 0 ) {
            return 1;
        }
        return x * power(x, n-1);
    }
    //for shorter time complexity O(log n)
    public static int powerOptimized(int x, int n) {
        if (n == 0) {
            return 1;     
        }
        int halfPower = powerOptimized(x, n/2); 
        int halfPowerSq  = halfPower * halfPower; 
        if( n%2 != 0 ) {
            return x* halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int n = 25;
        
        // printDec(n);

        // printInc(n);

        // System.out.println(factorial(n));

        //System.out.println(calcSum(n));

       // System.out.println(Fibonacci(n));


    //    int arr[] = {1, 2, 3, 4, 5, 6};
    //    System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 8, 10, 2, 8, 5};
        // System.out.println(firstOccurence(arr, 5, 0));

        // System.out.println(lastOccurence(arr, 5, 0));


        //System.out.println(power(2, 10));

        System.out.println(powerOptimized(2, 10));

    }
}




// import java.util.*;
// public class Recursion {
//     public static void printDec(int n) {
//         if(n == 1 ) {
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n+" ");
//         printDec(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);

//     }
// }