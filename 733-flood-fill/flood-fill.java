class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        if (initialColor == color) return image;
        int r = image.length; 
        int c = image[0].length;
        dfs(image, initialColor, color, sr, sc, r, c);
        return image;
    }

    public void dfs(int[][] image, int ic, int color, int i, int j, int r, int c) {
        if(i<0 || i>=r || j<0 || j>=c || image[i][j] != ic) 
            return;
        
        image[i][j] = color;

        dfs(image, ic, color, i+1, j, r, c);
        dfs(image, ic, color, i-1, j, r, c);
        dfs(image, ic, color, i, j+1, r, c);
        dfs(image, ic, color, i, j-1, r, c);
    }
}