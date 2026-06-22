// Container with most water
// For a given n lines on x axis , use 2 lines to form a container such that it holds maximum water.


import java.util.*;
public class Container_water {

//Brute Force
    public static int maxWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i = 0 ; i<height.size(); i++) {
            for(int j = i+1; j<height.size(); j++) {
                int currWater = Math.min(height.get(i), height.get(j)) * (j - i);
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

// Two pointer approach
    public static int waterArea(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while(lp < rp) {
           int ht = Math.min(height.get(lp), height.get(rp));  
           int width = rp - lp;
           int currWater = ht * width;
              maxWater = Math.max(maxWater, currWater);

              if(height.get(lp) < height.get(rp))m{
                    lp++;
                } else {
                    rp--;
              }
        }
    }

    public static void main(String args[]) {

        ArrayList<Integer> height  = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.addAll(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(maxWater(height));

        System.out.println(waterArea(height));
    }
}