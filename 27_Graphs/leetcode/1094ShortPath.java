class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]>q = new LinkedList<>();
        // if start or end is blocked
        if(grid[0][0] == 1 || grid[rows-1][cols-1] == 1) return -1;
        q.offer(new int[]{0,0});

        grid[0][0] = 1; // take dist as 1
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};

        while(!q.isEmpty()){
            int[] point = q.poll();
            int x = point[0];
            int y = point[1];
            if(x == rows-1 && y == cols-1) return grid[x][y];

            for(int[] dir:dirs){
                int x1 = x+dir[0];
                int y1 = y+dir[1];

                // out bounds
                if(x1 < 0 || y1 < 0 || x1 >= rows || y1 >= cols || grid[x1][y1] != 0) continue;
                //set distance
                grid[x1][y1] = grid[x][y]+1;
                q.offer(new int[]{x1,y1});
            }       
        }
        return -1;  
    }
}