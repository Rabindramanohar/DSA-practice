class Solution {
    public void gameOfLife(int[][] board) {
        int r = board.length, c = board[0].length;
        int[][] copyB = new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                copyB[i][j] = board[i][j];
            }
        }
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                int alive = 0;
                for(int k=0; k<8; k++) {
                    if(isValid(i+dx[k], j+dy[k], r, c) && copyB[i + dx[k]][j+dy[k]] == 1)
                        alive++;
                }
                if(copyB[i][j] == 0 && alive == 3)
                    board[i][j] = 1;
                if(board[i][j] == 1 && (alive < 2 || alive > 3))
                    board[i][j] = 0;
            }
        }
    }
    private boolean isValid(int x, int y, int r, int c) {
        return (x >= 0 && x < r && y >= 0 && y < c);
    }
}