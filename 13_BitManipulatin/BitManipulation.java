import java.util.*;

public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitmask  = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    // Get ith bit
    public static int getIthBit(int n, int i) {
        int bitmask  = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set ith Bit
    public static int setIthBit(int n, int i) {
        int bitmask  = 1<<i;
        return n | bitmask; 
    } 

    // clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }

    // Update ith Bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if( newBit == 0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

         n = clearIthBit(n, i);
        int BitMask  = newBit << i;
        return n | BitMask;
    }

    // clear last ith bit
    public static int clearLastIthBit(int n, int i) {
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }

    // clear range of bits
    public static int clearRangeBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
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

public static int fastExpo(int a , int n) {
    int ans = 1;
    while(n > 0) {
        if((n & 1) != 0) { //check LSB
            ans = ans * a;
        }
        a = a*a;
        n = n>>1;
    }
    return ans;
}

    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // oddOrEven(7);
        // System.out.println(getIthBit(5, 2));
        // System.out.println(setIthBit(10, 2)); // 14
        // System.out.println(clearIthBit(10, 1)); // 8
        // System.out.println(updateIthBit(10, 2, 1)); // 14
        // System.out.println(clearLastIthBit(15, 2)); // 12
        // System.out.println(clearRangeBits(31, 1, 3)); // 17

        System.out.println(fastExpo(3, 5));
    }

}