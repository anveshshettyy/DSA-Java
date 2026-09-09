class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1_000L;
        int commas = 1;

        while (start <= n) {
            long end = Math.min(n, start * 1000 - 1);

            ans += (end - start + 1) * commas;

            commas++;

            if (start > Long.MAX_VALUE / 1000) break;
            start *= 1000;
        }

        return ans;
    }
}