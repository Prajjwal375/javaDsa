import java.util.ArrayList;
import java.util.Collections;

import java.util.*;
public class Class {
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2, 3));
        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(4, 5, 6));
        mainList.add(list1);

        for(int i = 0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j= 0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        // add elements
        list.add(1); // O(1)
        list.addAll(Arrays.asList(2,3,4,5));
        list.add(2,11); // O(n)
        System.out.println(list);

        // //Get Operation
        // System.out.println(list.get(1)); // O(1)

        // //Delete
        // list.remove(2); // O(n) //index based deletion

        // // Set element at index
        // list.set(2, 10); // O(1)  replace element at index 2 with 10

        // //contains 
        // list.contains(1); // O(n)


        ///////////////////////////////
        /// Size of arraylist
        
        // System.out.println(list.size()); // O(1)
        // System.out.println(list.isEmpty()); // O(1)

        // for(int i=0; i<list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }

        // // Reverse
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        // // Max
        // int max = Integer.MIN_VALUE;;
        // for(int i=0; i<list.size(); i++) {
        //     // if(list.get(i) > max) {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("Max element is " + max);


        //Swap two numbers
        swap(list, 1, 3);
        System.out.println(list);

        // Sorting
        Collections.sort(list); // ascending
        Collections.sort(list, Collections.reverseOrder()); // Comparator for descending order
        System.out.println(list);

    }
}