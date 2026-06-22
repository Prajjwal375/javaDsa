// Monotonic Arraylist

import java.util.*;
public class Monotonic_Arraylist {
    public static boolean Monotonic(ArrayList<Integer> List) {
        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<List.size()-1; i++) {
            if(List.get(i) > List.get(i+1)) {
                inc =  false;
            }
        }
        for(int i=0; i<List.size()-1; i++) {
            if(List.get(i) < List.get(i+1)) {
                dec =  false;
            }
        }
        return inc || dec;
    }
public static void main(String args[]) {
    ArrayList<Integer> List = new ArrayList<>();
    List.addAll(Arrays.asList(6, 5, 4, 4));
    System.out.println(Monotonic(List));
}

}