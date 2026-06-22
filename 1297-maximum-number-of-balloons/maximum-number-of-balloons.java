class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        int res = Integer.MAX_VALUE;
        for(char c: text.toCharArray()) {
            arr[c-'a']++;
        }

        for(int i=0; i<20; i++) {
            if(i == 1 || i == 0 || i == ('n'-'a')) {
                res = Math.min(res, arr[i]);
            } else if(i == ('l'-'a') || i == ('o'-'a')) {
                res = Math.min(res, arr[i]/2);
            }
        }
        return res;
    }
}