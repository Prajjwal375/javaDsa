// if problem focus on lowercase letters then we can use boolean array of size 26 to keep track of the characters that have already been added to the StringBuilder. This way, we can avoid adding duplicates and only keep the first occurrence of each character.

public class Remove_duplicates{
    public static void main(String args[]) {
        String str = "aaabbccdde";
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];

        removeDuplicates(str, map, sb, 0);

    }

    public static void removeDuplicates(String str, boolean[] map,StringBuilder sb, int idx){
        

        // base case
        if(idx == str.length()){
            System.out.println(sb.toString());
             return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, map, sb, idx+1);
        }else {
            sb.append(currChar);
            map[currChar-'a'] = true;
             removeDuplicates(str, map, sb, idx+1);
        }
    }
}


// if problem focuses on different characters, then we can use a HashSet to keep track of the characters that have already been added to the StringBuilder. This way, we can avoid adding duplicates and only keep the first occurrence of each character.

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbccdde";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Boolean> map = new HashMap<>();

        removeDuplicates(str, map, sb, 0);
    }

    public static void removeDuplicates(String str,
                                        HashMap<Character, Boolean> map,
                                        StringBuilder sb,
                                        int idx) {

        // Base case
        if (idx == str.length()) {
            System.out.println(sb.toString());
            return;
        }

        char currChar = str.charAt(idx);

        if (map.containsKey(currChar)) {
            removeDuplicates(str, map, sb, idx + 1);
        } else {
            map.put(currChar, true);
            sb.append(currChar);
            removeDuplicates(str, map, sb, idx + 1);
        }
    }
}


// frequency count
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbccdde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters in original order
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (map.get(ch) > 0) {
                sb.append(ch);
                map.put(ch, 0); // mark as already added
            }
        }

        System.out.println(sb);
    }
}