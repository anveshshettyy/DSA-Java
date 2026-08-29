class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for(String word: words) {
            int sum = 0;
            for(char ch: word.toCharArray()) {
                int idx = ch - 'a';
                sum += weights[idx];
            }
            sum = sum % 26;
            res += (char)('z' - sum);
        }
        return res;
    }
}