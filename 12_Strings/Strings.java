import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static String subString(String str, int si, int ei) {
        String substr = "" ;
        for(int i = si; i <ei; i++) {
            substr += str.charAt(i);
        } 
        return substr;
    }

    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String strr2 = new String("xyz");

        // //Strings are Immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "prajval Saki";
        // System.out.println(fullName.length());




        // // concatenation 
        // String firstName = "Prajval";
        // String lastName = "Saki";
        // String fullName = firstName + " " + lastName;
        // //System.out.println(fullName);

        // printLetters(fullName);


        // Substring
        String str = "HelloWorld";
        //System.out.println(subString(str, 0, 5));
        

        // Existing SSubstring function in java
        System.out.println(str.substring(0, 5));
    }
}