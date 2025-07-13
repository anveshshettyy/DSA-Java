class Solution {
    public void backTracking(List<String> res, String s, int start, int end, int n) {
        if(s.length() == 2*n) {
            res.add(s);
            return;
        }

        if(start < n) {
            backTracking(res, s+"(", start+1, end, n);
        }

        if(end < start) {
            backTracking(res, s+")", start, end+1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTracking(res, "", 0, 0, n);
        return res;
    }
}