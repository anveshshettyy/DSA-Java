class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                minHeap.add(matrix[i][j]);
            }
        }

        int res = 0;
        for(int i=0; i<k; i++) {
            res = minHeap.poll();
        }
        return res;
    }
}