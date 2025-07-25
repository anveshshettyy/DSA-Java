class Solution {
    public Double getDistance(int[] point) {
        return Math.sqrt(point[0]*point[0] + point[1]*point[1]);
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) -> getDistance(p1).compareTo(getDistance(p2)));

        for(int i=0; i<points.length; i++) {
            minHeap.add(points[i]);
        }

        int[][] res = new int[k][2];

        for(int i=0; i<k; i++) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}