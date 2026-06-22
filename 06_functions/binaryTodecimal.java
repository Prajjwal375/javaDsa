// binary to decimal conversion

import java.util.*;
public class binaryTodecimal {

    public static void binToDec(int binNum) {
        int pow = 0;               // start from 2^0
        int decNum = 0;
        int original = binNum;     // store original number

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decimal of " + original + " = " + decNum);
    }

    public static int decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int original = n;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println("binary of " + original + " = " + binNum);
        return binNum;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        binToDec(binNum);
        decToBin(decNum);
    }
}



