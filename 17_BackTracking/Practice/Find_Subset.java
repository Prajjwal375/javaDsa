// "abc" = a, b, c, ab, ac, bc, abc
    // Time Complexity = O(n* 2^n)
    // Space Complexity = O( )
public class Find_Subset {
    public static void FindSubset(String str, String ans, int i ) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0 ) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            
            return;

        }
        // recursion
        // yes choice
        FindSubset(str, ans+str.charAt(i), i+1);
        // no - choice
        FindSubset(str, ans, i+1);
    }
 

    public static void main(String args[]) {
        String str = "abc";
        FindSubset(str, "", 0);
    }

}