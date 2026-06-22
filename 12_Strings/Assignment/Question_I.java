// count how many times lowercase vowels occuerrd in atring enetred by the user

import java.util.*;
public class Question_I {
    public static int countVowels(String str) {
        int count =0;
        for(int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count ++;
            }
        
        }
        
        System.out.println("Number of vowels: " + count);
        return count;
    }


    public static void main(String[] args) {
        String str = "Hello i am prajval Saki";
        countVowels(str);
    }
}