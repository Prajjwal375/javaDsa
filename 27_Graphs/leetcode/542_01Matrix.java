class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        // Put all 0s into queue
        // Change all 1s to -1 (unvisited)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty()) {

            int[] point = q.poll();

            for (int[] dir : dirs) {

                int x = point[0] + dir[0];
                int y = point[1] + dir[1];

                // Out of bounds
                if (x < 0 || y < 0 ||
                    x >= rows || y >= cols) {
                    continue;
                }

                // Already visited
                if (mat[x][y] != -1) {
                    continue;
                }

                // Set distance
                mat[x][y] = mat[point[0]][point[1]] + 1;

                // Add to queue
                q.offer(new int[]{x, y});
            }
        }

        return mat;
    }
}