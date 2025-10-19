class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int c) {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] != c) return;

        image[sr][sc] = color;

        dfs(image, sr+1, sc, color, c);
        dfs(image, sr-1, sc, color, c);
        dfs(image, sr, sc+1, color, c);
        dfs(image, sr, sc-1, color, c);
    }
}