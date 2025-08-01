class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String s: sentences) {
            String[] str = s.split(" ");
            int words = str.length;
            maxWords = Math.max(words, maxWords);
        }
        return maxWords;
    }
}