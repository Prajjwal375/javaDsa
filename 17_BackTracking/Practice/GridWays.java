// public class GridWays {
//     public static int grid(int i, int j, int m, int n) {

//         // base case
//         if(i== m-1 && j== n-1 ) {
//             return 1;
//         } else if(i== m || j== n) {  // boundary cond.
//             return 0;
//         }
//         int w1 = grid(i+1, j, m, n);
//         int w2 = grid(i, j+1, m, n);
//         return w1 + w2;
//     }
//     public static void main(String args[]) {
//         int n=3, m=3;
//         System.out.println(grid(0, 0, m, n));

//     }
// }

// for linear time complexity


public class GridWays {
    public static int grid(int m, int n) {
        int k = (m + n -2);
        int r = Math.min(n-1, m-1);
        int res =1;
        for(int i=1; i<=r; i++) {
            res = res*(k-r+i)/i;
        }
        return res; 
    }
    public static void main(String args[]) {
        int m=3, n=3;
        System.out.println(grid(m, n));
    }
}







