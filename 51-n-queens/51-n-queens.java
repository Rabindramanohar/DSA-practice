class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        // creating board and initialize with '.';
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
        
        // first check if current board[row][col] is valid to fill 'Q' then recursively fill.
        for(int row=0; row<board.length; row++) {
            if(isValid(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col+1, ans, board);
                board[row][col] = '.';
            }
        }
    }
    
    // isValid will tell the curr board block is valid or not. Here we are checking with 3 condition 1. curr block till 0th col row-wise. 2. In North-west direction where row-- and col--, and check for 'Q' available or not. 3. In South-west directino where row++ and col--, and check for 'Q' is available or not.
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
    
    // construct is used to build board in string format and store in list.
    private List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            String str = new String(board[i]);
            ans.add(str);
        }
        return ans;
    }
}