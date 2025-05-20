class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> res = new ArrayList<>();
        backtracking(res,"", 0, 0, n);
        return res;
    }

    public static void backtracking(List<String> res,String ans, int start, int end, int n) {
        if(ans.length() == 2*n) {
            res.add(ans);
            return;
        }

        if(start<n) {
            backtracking(res, ans+"(", start+1, end, n);
        }

        if(end < start) {
            backtracking(res, ans+")", start, end+1, n);
        }
    }
}