class Solution {
    public int numberOfSpecialChars(String word) {
        int letters[] = new int[26];
        for(char c: word.toCharArray()) {
            if(c>='a' && c<='z') {
                letters[c-'a'] = 1;
            }
        }
        int count = 0;
        for(char c: word.toCharArray()) {
            if(c>='A' && c<='Z' && letters[c-'A'] == 1) {
                letters[c-'A'] += 1;
                count++;
            }
        }
        return count;

    }
}