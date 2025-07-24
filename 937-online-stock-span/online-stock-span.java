class StockSpanner {
    ArrayList<Integer> list = new ArrayList<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(list.isEmpty()) {
            list.add(price);
            return 1;
        } 

        list.add(price);
        int count = 1;
        
        for(int j=list.size()-2; j>=0; j--) {
            if(list.get(j) <= price) {
                count++;
            } else if(list.get(j) > price) {
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */