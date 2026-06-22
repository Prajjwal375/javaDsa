//Time complexity : O(n)

import java.util.*;
public class PairSum_two {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1; // smallest
        int rp = bp; // largest
        int n = list.size();

        while(lp!=rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> List = new ArrayList<>();
        List.addAll(Arrays.asList(11, 15, 6, 8, 9, 10));
        System.out.println(pairSum(List, 16));
    }
}


