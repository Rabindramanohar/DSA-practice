class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        dfs(0, ans, board);
        return ans;
    }
    
    private void dfs(int col, List<List<String>> ans, char[][] board) {
        if(col == board.length) {
            ans.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++) {
            if(isValid(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col+1, ans, board);
                board[row][col] = '.';
            }
        }
    }
    
    private boolean isValid(char[][] board, int row, int col) {
        int tmpRow = row, tmpCol = col;
        while(row >= 0 && col >=0) {
            if(board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }
        row = tmpRow;
        col = tmpCol;
        while(col >= 0) {
            if(board[row][col] == 'Q')
                return false;
            col--;
        }
        row = tmpRow;
        col = tmpCol;
        while(col >= 0 && row < board.length) {
            if(board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }
        return true;
    }
    
    private List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            String str = new String(board[i]);
            ans.add(str);
        }
        return ans;
    }
}