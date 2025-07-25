class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<int[]> rows = new ArrayList<>();
        
        for(int i=0; i<mat.length; i++) {
            int count = 0;
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j] == 1) count++;
                else break;
                
            }
            rows.add(new int[]{i, count});
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            if(a[1] != b[1]) return a[1] - b[1];
            return a[0] - b[0];
        });

        heap.addAll(rows);

        int res[] = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = heap.poll()[0];
        }

        return  res;
    }
}