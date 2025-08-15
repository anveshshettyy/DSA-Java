class Solution {
    public boolean dfs(char[][] board, String word, int i, int j, int pos) {
        if(pos == word.length()) return true;
        if(i>=board.length || i<0 || j>=board[0].length || j<0) return false;   
        if(board[i][j] != word.charAt(pos)) return false;

        char temp = board[i][j];
        board[i][j] = '#';

        boolean down = dfs(board, word, i+1, j, pos+1); //down
        boolean up = dfs(board, word, i-1, j, pos+1); //up
        boolean left = dfs(board, word, i, j-1, pos+1); //left
        boolean right = dfs(board, word, i, j+1, pos+1); //right

        board[i][j] = temp;

        return (down || up || left || right);
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }
}