class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sArray[] = new int[26];
        int pArray[] = new int[26];

        if(p.length() > s.length()) return new ArrayList<>(0);

        for(char c: p.toCharArray()) {
            pArray[c-'a']++;
        }

        int k = p.length();
        for(int i=0; i<k; i++) {
            char c = s.charAt(i);
            sArray[c-'a']++;
        }
        if(Arrays.equals(pArray, sArray)) {
                res.add(0);
            }

        for(int i=k; i<s.length(); i++) {
            sArray[s.charAt(i-k) - 'a']--;
            sArray[s.charAt(i)-'a']++;
            if(Arrays.equals(pArray, sArray)) {
                res.add(i-k+1);
            }

        }

        // for(int i=0; i<26; i++) {
        //     System.out.println(sArray[i]+" "+pArray[i]);
        // }

        return res;
    }
}