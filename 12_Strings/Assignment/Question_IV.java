import java.util.Arrays;
public class Question_IV {
    

    public static void main(String[] args) {
        String str1 = "race";
        String str2  = "care";


    // convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if both string has same length
        if(str1.length() == str2.length()) {
            // convert Strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // check if both sorted char arrays are equal
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result == true) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        }
        else {
            System.out.println(str1 + "and" + str2 + " are not anagrams of each other");
        }
    }
}