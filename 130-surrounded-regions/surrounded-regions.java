class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0; i<row; i++) {
            if(board[i][0] == 'O') capture(board, i, 0, row, col);
            if(board[i][col-1] == 'O') capture(board, i, col-1, row, col);
        }

        for(int i=0; i<col; i++) {
            if(board[0][i] == 'O') capture(board, 0, i, row, col);
            if(board[row-1][i] == 'O') capture(board, row-1, i, row, col);
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    public void capture(char[][] board, int i, int j, int n, int m) {
        if(i<0 || i>=n || j<0 || j>=m || board[i][j]!='O') return;

        board[i][j] = 'T';
        capture(board, i-1, j, n , m);
        capture(board, i+1, j, n , m);
        capture(board, i, j-1, n , m);
        capture(board, i, j+1, n , m);
    }
}