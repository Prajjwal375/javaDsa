class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean result = false;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == word.charAt(0)){
                    //call
                    result = WSearch(board,word,i,j,0,visited);
                    if(result) return true;
                }
            }
        }
        return false;

    }
    public static boolean WSearch(char[][] board, String word, int i, int j, int idx, boolean[][] visited){

        // base case
        if(idx == word.length()){
            return true;
        }
        // ignore case
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(idx) || visited[i][j]){
            return false;
        }
         visited[i][j] = true;

        // call neighbours
        if(WSearch(board,word,i+1,j,idx+1,visited)||
        WSearch(board,word,i-1,j,idx+1,visited)||
        WSearch(board,word,i,j+1,idx+1,visited)||
        WSearch(board,word,i,j-1,idx+1,visited)){
            return true;
        }
         visited[i][j] = false;
        return false;
    }
} 