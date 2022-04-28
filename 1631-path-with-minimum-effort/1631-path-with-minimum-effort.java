class Solution {
    public int minimumEffortPath(int[][] heights) {
        int l=0, r=1000001;
        while(l < r) {
            int mid = (l+r)/2;
            if(isValidBFS(heights, mid))
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
    private boolean isValidBFS(int[][] arr, int limit) {
        int R = arr.length, C = arr[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        boolean[][] vis = new boolean[R][C];
        int[][] dir = new int[][]{{1,0}, {0,1}, {-1, 0}, {0, -1}};
        while(q.size() > 0) {
            int x = q.peek()[0];
            int y = q.peek()[1];
            q.poll();
            if(x==R-1 && y==C-1)
                return true;
            for(int[] d : dir) {
                int nx = x+d[0];
                int ny = y+d[1];
                if(nx >= 0 && ny >= 0 && nx < R && ny < C && !vis[nx][ny]) {
                    if(Math.abs(arr[x][y]-arr[nx][ny]) <= limit) {
                        q.add(new int[]{nx, ny});
                        vis[nx][ny] = true;
                    }
                }
            }
        }
        return false;
    }
}