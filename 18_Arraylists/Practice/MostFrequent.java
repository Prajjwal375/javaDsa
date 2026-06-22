// We must find the number that most frequently appears immediately after the key.

import java.util.*;
public class MostFrequent {
    public static int mostFrequent(ArrayList<Integer> list, int key) {
        int count[] = new int[1001]; 
        for(int i = 0; i< list.size()-1; i++) {
            if(list.get(i) == key) {
                count[list.get(i+1)]++;
            }
        }
        int max = 0;
        for(int i = 0; i<count.length; i++) {
            if(count[i] > count[max]) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,100,200,1,100));
        int key = 1;
        System.out.println(mostFrequent(list, key));
    }
}