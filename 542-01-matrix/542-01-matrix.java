/**class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        
        if(matrix == null)
            return matrix;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == 0) {
                    queue.offer(i * cols + j);  
                } else if(matrix[i][j] == i) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int[] dir = {0, 1, 0, -1, 0};
        while(!queue.isEmpty()) {
            int top = queue.poll();
            for(int k = 0; k < dir.length-1; k++) {
                int x = top/cols + dir[k];
                int y = top%cols + dir[k+1];
                
                if(x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] > 0 && matrix[x][y] > matrix[top/cols][top%cols] + 1) {
                    matrix[x][y] = matrix[top/cols][top%cols] + 1;
                    queue.offer(x*cols+y);
                }
            }
        }
        return matrix;
    }
} **/

class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        int[] dirs = {-1, 0, 1, 0, -1};
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int i = 0; i < 4; i++) {
                int r = cell[0] + dirs[i];
                int c = cell[1] + dirs[i + 1];
                if (r < 0 || r >= m || c < 0 || c >= n || 
                    matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) continue;
                queue.add(new int[] {r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }
        
        return matrix;
    }
}