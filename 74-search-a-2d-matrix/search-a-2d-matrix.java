class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++) {
            int l = 0, r = matrix[0].length-1;
            while(l<=r) {
                int mid = (r + l) / 2;
                int num = matrix[i][mid];
                if(num == target) return true;
                else if(num > target) r = mid - 1;
                else l = mid + 1;
            }
        }
        return false;
    }
}