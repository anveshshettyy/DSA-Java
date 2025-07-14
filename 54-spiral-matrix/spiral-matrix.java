class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, left = 0;
        int bottom = mat.length, right = mat[0].length;

        while (top < bottom && left < right) {
            for (int i = left; i < right; i++) {
                list.add(mat[top][i]);
            }

            top++;

            for (int i = top; i < bottom; i++) {
                list.add(mat[i][right - 1]);
            }

            right--;
            if (top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(mat[bottom - 1][i]);
                }
                bottom--;
            }

            if (left < right) {
                for (int i = bottom - 1; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}