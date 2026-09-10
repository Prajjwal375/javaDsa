class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i< rows; i++){
            if(board[i][0] == 'O'){
                surround(board, i, 0, rows, cols);
            }
            if(board[i][cols - 1] == 'O'){
                surround(board, i, cols - 1, rows, cols);
            }
        }
        for(int j = 0; j< cols; j++){
            if(board[0][j] == 'O'){
                surround(board, 0, j, rows, cols);
            }
            if(board[rows-1][j] == 'O'){
                surround(board, rows-1, j, rows, cols);
            }
        }
        // Remaining zeroes all are surrounded so convert to X
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        // NOW edges T-> O
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }

    }
    public static void surround(char[][]board, int i, int j, int rows, int cols){
        // ignore case
        if(i<0 || j<0 || i>=rows || j>=cols || board[i][j] =='X'|| board[i][j]=='T'  ){
            return ;
        }
        board[i][j]='T';
        // call neighbour
        surround(board,i-1,j,rows,cols);
        surround(board,i+1,j,rows,cols);
        surround(board,i,j-1,rows,cols);
        surround(board,i,j+1,rows,cols);
    }
}