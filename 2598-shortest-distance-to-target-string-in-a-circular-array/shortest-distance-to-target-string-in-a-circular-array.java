class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int res = Integer.MAX_VALUE, n = words.length;
        for(int i=0; i<words.length; i++) {
            if(words[i].equals(target)) {
                int len1 = Math.abs(startIndex - i) ;
                int len2 = n - len1;
                res = Math.min(res, Math.min(len1, len2));
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}