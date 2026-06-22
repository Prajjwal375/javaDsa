public class Sudoku_solver {
    public static boolean isSafe(int sudoku[][], int row, int col, int num) {
        // row
        for(int i=0; i<9; i++) {
            if(sudoku[row][i] == num) {
                return false;
            }
        }
        // column
        for(int i=0; i<9; i++) {
            if(sudoku[i][col] == num) {
                return false;
            }
        }
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(sudoku[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static  boolean Sudoku(int sudoku[][], int row, int col){
        // base case
        if((row ==9)) {
            return true;
        } 

        // recursion
        
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0) {
            return Sudoku(sudoku, nextRow, nextCol);
        }
        for(int num=1; num<=9; num++) {
           if( isSafe(sudoku, row, col, num)) {
            sudoku[row][col] = num;
            if(Sudoku(sudoku, nextRow, nextCol)) {
                return true;
            }
            sudoku[row][col] = 0; // backtracking
           }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }    
    public static void main(String args[]) {
        int sudoku[][] = {
    {0, 0, 3, 6, 0, 0, 0, 0, 0},
    {0, 7, 0, 0, 9, 0, 2, 0, 0},
    {0, 5, 0, 0, 0, 7, 0, 0, 0},
    {0, 0, 0, 0, 4, 5, 7, 0, 0},
    {8, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 1, 0, 0, 0, 3, 0},
    {0, 0, 1, 0, 0, 0, 0, 6, 8},
    {0, 0, 8, 5, 0, 0, 0, 1, 0},
    {0, 9, 0, 0, 0, 0, 4, 0, 0}
};
        if(Sudoku(sudoku, 0, 0)) {
            System.out.println("Solution is possible");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}