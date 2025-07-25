class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer idx[] = new Integer[n];
        for(int i =0; i<n; i++) {
            idx[i] = i;
        }

        String res[] = new String[n];

        Arrays.sort(idx, (a, b) -> score[b] - score[a]);

        for(int i=0; i<n; i++) {
            String s = "";
            if(i==0) {
                s = "Gold Medal";
            } else if(i==1) {
                s = "Silver Medal";
            } else if(i==2) {
                s = "Bronze Medal";
            } else {
                s = Integer.toString(i+1);
            }
            res[idx[i]] = s; 
        }

        return res;
    }
}