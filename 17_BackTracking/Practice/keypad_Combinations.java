public class keypad_Combinations {
    static String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void keypad(String str, int i, String ans) {
        // base case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        // recursion
       char curr = str.charAt(i);
       String letters = map[curr - '0']; // to get the corresponding string from the map
       for(int j=0; j<letters.length(); j++) {
              char letter = letters.charAt(j);
              keypad(str, i+1, ans + letter);
       }
    }
    public static void main(String args[]) {
        String str = "23";

        if(str.length() == 0 ) {
            System.out.println("");
        } else {
            keypad(str, 0 , "" );   
        }
        

    }
}