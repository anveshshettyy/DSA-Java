class Solution {
    public List<List<Integer>> generate(int numRows) {
        numRows -= 1;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i <= numRows; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                arr.add(1);
            }
            res.add(arr);
        }

        for (int i = 2; i <= numRows; i++) {
            for (int j = 1; j < i; j++) {
                int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                res.get(i).set(j, val);
            }
        }

        return res;

    }
}