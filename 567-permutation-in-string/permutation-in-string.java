class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if(s2.length() < k) return false;

        int count1[] = new int[26];
        int count2[] = new int[26];

        for(char c: s1.toCharArray()) {
            count1[c-'a']++;
        }

        for(int i=0; i<k; i++) {
            char c = s2.charAt(i);
            count2[c-'a']++;
        }

        if (Arrays.equals(count1, count2)) return true;

        for(int i=k; i<s2.length(); i++) {
            char c = s2.charAt(i);
            count2[c-'a']++;
            count2[s2.charAt(i-k) - 'a']--;
            if(Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
}