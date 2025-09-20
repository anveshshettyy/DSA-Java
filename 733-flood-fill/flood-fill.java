class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int i, int j, int color, int real) {
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != real) return;

        image[i][j] = color;

        
        helper(image, i+1, j, color, real);
        helper(image, i-1, j, color, real);
        helper(image, i, j+1, color, real);
        helper(image, i, j-1, color, real);
    }
}