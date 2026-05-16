class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int col[] = new int[strs[0].length()];
        for(int i=0; i<strs.length-1; i++) {
            for(int j=0; j<strs[i].length(); j++) {
                if(strs[i].charAt(j) > strs[i+1].charAt(j) && col[j] == 0) {
                    col[j] = 1;
                    count++;
                }
            }
        }
        return count;
        
    }
}