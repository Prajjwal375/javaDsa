class Solution {
    public int orangesRotting(int[][] grid) {
        // base case
       if(grid == null || grid.length == 0) return 0;
       int rows = grid.length;
        int cols = grid[0].length;
       Queue<int[]> q = new LinkedList<>();
       int fresh = 0; // intialize fresh count for oranges

       // put rot orranges posn in queeue
       for(int i=0; i< grid.length; i++){
        for(int j = 0; j< grid[0].length; j++){
            if( grid[i][j] == 2){
                q.offer(new int[]{i,j});
            }else if(grid[i][j] == 1){
                fresh++;
            }
        }
       }

       // no fresh no time needed
       if(fresh == 0) return 0;
       int count = 0; // elapsed time
       int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

       while(!q.isEmpty()){
        int size = q.size();
        for(int i = 0; i< size; i++){
            int[] point = q.poll();
            for(int dir[]:dirs){
                int x = point[0]+dir[0];
                int y = point[1]+dir[1];

                // ignore cases
                if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)continue;
                grid[x][y]= 2;

                q.offer(new int[]{x,y});
                fresh--;
            } 
        }
        count++;
       if(fresh == 0) return count;

       }
       
       return -1;
    }
}