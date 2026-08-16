// abc = abc, acb , bac, bca, cab, cba
//Time complexity = O(n*n!) 
public class Permutation{
    public static void Permutation(String str, String ans ) {
        // base case
        if(str.length() == 0 ) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            // i index pe uss ko chod ke sab ke liye call karna kyuki wo to string me add ho gyi already
            String newstr = str.substring(0, i ) + str.substring(i+1);
            Permutation(newstr, ans+curr);

        }
    }
    public static void main(String args[]) {
        String str = "abc";
        Permutation(str, "");
    }
}