class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int active = 0;

        for (char ch : s.toCharArray())
            if (ch == '1')
                active++;

        List<Integer> zeroBlocks = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            int start = i;

            while (i < s.length() && s.charAt(i) == s.charAt(start))
                i++;

            if (s.charAt(start) == '0')
                zeroBlocks.add(i - start);
        }

        if (zeroBlocks.size() < 2)
            return active;

        int bestGain = 0;

        for (int j = 0; j + 1 < zeroBlocks.size(); j++) {
            bestGain = Math.max(bestGain, zeroBlocks.get(j) + zeroBlocks.get(j + 1));
        }

        return active + bestGain;
    }
}