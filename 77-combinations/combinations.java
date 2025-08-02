class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void fun(int n, int k, int i, ArrayList<Integer> list) {
        if(k == list.size()) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int j=i+1; j<=n; j++){
            list.add( j);
            fun(n, k, j, list);
            list.remove(list.get(list.size()-1));
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        fun(n, k, 0, new ArrayList<>());
        return res;
    }
}