import java.util.*;
public class BitQuestion {
    public static boolean isPowerOfTwo(int n) {
    return (n&(n-1)) == 0;
}

// count Set-bits
public static int countSetBits(int n) {
    int count = 0;
    while(n>0) {
        if((n & 1) != 0) { //check LSB
            count ++;
        }
        n = n>>1;
    }
    return count;
}
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(9)); // false  

        System.out.println(countSetBits(10));
    }
}



// import java.util.*;
// public class BitQuestion {
//     public static boolean isPowerOfTwo(int n) {
//     if (n <= 0) return false;
//     while (n % 2 == 0) {
//         n = n / 2;
//     }
//     return n==1;
//     // if(n ==1) {
//     // return true;
//     // }
//     // return false;
// }
//     public static void main(String[] args) {
//         System.out.println(isPowerOfTwo(16)); // true
//         System.out.println(isPowerOfTwo(9)); // false  

//     }
// }