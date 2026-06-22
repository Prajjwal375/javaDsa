public class Knight_Tour {
    static int moveX[] = {2, 2, -2, -2, 1, 1, -1, -1};
    static int moveY[] = {1, -1, 1, -1, 2, -2, 2, -2};

    // issafe
    public static boolean isSafe(int board[][], int row, int col) {
        if(row >=0 && col >=0 && row< board.length && col< board.length && board[row][col] == -1) {
            return true;
        }
        return false;
    }
    public static boolean knightTour(int board[][], int row, int col, int move) {
        // base case
        if(move == board.length* board.length) {
            printBoard(board);
            return true;
        }
        //recursion
        for(int k=0; k<moveX.length; k++) {
            int nextX = row + moveX[k];
            int nextY = col + moveY[k];
            if(isSafe(board, nextX, nextY)) {
                board[nextX][nextY] = move;
                if(knightTour(board, nextX, nextY, move+1)) {
                    return true;
                }
                // backtrack
                board[nextX][nextY] = -1;
            }
        }
        return false;
    }
    public static void printBoard(int board[][]) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
                
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int n = 8;
        int board[][] = new int[n][n];

        // initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = -1;
            }
        }
        // start position 
        board[0][0] = 0;
        knightTour(board, 0, 0, 1);
    }
}