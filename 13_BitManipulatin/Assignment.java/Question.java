// QUESTION 1
//What is the value of x^x for any valueof x
// Thinkaboutit,xorgives0whenthebitsarethesame.Ifwecomparethesamenumbertoitself, the bits will always be the same. So, the answer of x^x will always be 0

//  QUESTION 2


import java.util.*;
public class Question {
    public static void main(String[] args) {
        // int x = 3, y = 4;
        // // swap using xor
        // // we know x^x = 0
        // x = x^y;
        // y = x^y;
        // x = x^y;
        // System.out.println(a + " " + b);


        // int x = 6;
        // System.out.println(x + "+" + 1 + "is" + -~x);

        // CONVERT LOWER CASE LETTER TO UPPERCASE USING BITS
            for(char ch='A'; ch <= 'Z'; ch++) {{
                System.out.println((char)(ch | ' '));
            }}
    }
}