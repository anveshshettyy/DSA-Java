class Solution {
    public int numberOfSpecialChars(String word) {
        int letters[] = new int[26];
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if(letters[(c - 'a')] == 2) {
                    letters[(c - 'a')] = -100;
                }
                else if(letters[c - 'a'] == 0) {
                    letters[c - 'a'] = 1;
                }
            } else if (c >= 'A' && c <= 'Z' && letters[(c - 'a') + 32] == 1) {
                letters[(c - 'a') + 32] = 2;
            } else if (c >= 'A' && c <= 'Z' && letters[(c - 'a') + 32] == 0) {
                letters[(c - 'a') + 32] = -100;
            }
        }

        for(int i=0; i<26; i++) {
            if(letters[i] == 2) count++;
        }
        return count;
    }
}