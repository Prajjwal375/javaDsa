class Solution {
    public int numIslands(char[][] grid) {
    int rows = grid.length;       
    int cols = grid[0].length;       
    int count = 0;

    for(int i=0; i<rows;i++){
        for(int j=0; j< cols; j++){
            if(grid[i][j] =='1'){
                count++;
                traverse(grid,i,j,rows,cols);
            }
        }
    }
    return count;
    }
    public static void traverse(char[][]grid, int i, int j, int rows, int cols){
        if(i<0||j<0||i>=rows||j>=cols||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        //calling neighbour
        traverse(grid,i-1,j,rows,cols);
        traverse(grid,i+1,j,rows,cols);
        traverse(grid,i,j-1,rows,cols);
        traverse(grid,i,j+1,rows,cols);
    }
}