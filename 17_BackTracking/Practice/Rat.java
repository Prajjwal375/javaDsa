// Youaregivenastartingpositionforaratwhichisstuckinamazeataninitialpoint(0,0)(themazecanbethoughtofasa2-dimensionalplane).ThemazewouldbegivenintheformofasquarematrixoforderN*Nwherethecellswithvalue0representthemaze’sblockedlocationswhilevalue1istheopen/availablepaththattheratcantaketoreachitsdestination.The rat's destination is at (N - 1, N - 1).Yourtaskistofindallthepossiblepathsthattheratcantaketoreachfromsourcetodestination in the maze.Thepossibledirectionsthatitcantaketomoveinthemazeare'U'(up)i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).(This problem is similar to Grid ways.)Sample Input: int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };prajjwalsaki375@gmail.com


// public class Rat{
//     public static int ratMaze(int maze[][], int i, int j) {
//         // base case
//         int n = maze.length;
//         // boundary and blocked check
//         if(i<0 || j<0 || i>=n || j>=n || maze[i][j] == 0) {
//             return 0;
//         }
//         // destination check
//         if(i== n-1 && j== n-1) {
//             return 1;
//         } 
//         // 
//         maze[i][j] = 0; // mark as visited

//         // recursion
//         int up = ratMaze(maze, i-1, j);
//         int down = ratMaze(maze, i+1, j);
//         int right = ratMaze(maze, i, j+1);
//         int left = ratMaze(maze, i, j-1);

//         // bACKTRACK 
//         maze[i][j] = 1; // unmark
//         return up + down + right + left;
         

//     }
//     public static void main(String args[]) {
//         int maze[][] = {{1, 0, 0, 0},
//                         {1, 1, 0, 1},
//                         {0, 1, 0, 0},
//                         {1, 1, 1, 1}};
//         System.out.println(ratMaze(maze, 0, 0));
//     }

// }




public class Rat {

    public static void solve(int[][] maze, int n) {

        int[][] sol = new int[n][n];

        if (!ratMaze(maze, 0, 0, sol, n)) {
            System.out.println("No Solution");
        }
    }

    public static boolean ratMaze(int[][] maze, int i, int j,
                                  int[][] sol, int n) {

        // Boundary + blocked check
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0)
            return false;

        // Mark current cell in solution
        sol[i][j] = 1;

        // Destination reached
        if (i == n - 1 && j == n - 1) {
            printSolution(sol, n);
            sol[i][j] = 0; // backtrack for other paths
            return true;
        }

        // Mark visited
        maze[i][j] = 0;

        // Explore all 4 directions
        ratMaze(maze, i + 1, j, sol, n); // Down
        ratMaze(maze, i, j + 1, sol, n); // Right
        ratMaze(maze, i - 1, j, sol, n); // Up
        ratMaze(maze, i, j - 1, sol, n); // Left

        // Backtrack
        maze[i][j] = 1;
        sol[i][j] = 0;

        return false;
    }

    public static void printSolution(int[][] sol, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        solve(maze, 4);
    }
}