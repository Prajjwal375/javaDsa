//You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
import java.util.*;

public class Question_iii {

    public static int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for( int i=0; i<prices.length; i++ ){
            if( buyprice < prices[i] ){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        // input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // declare array
        int prices[] = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Max profit is :" + maxProfit(prices));
    }
}