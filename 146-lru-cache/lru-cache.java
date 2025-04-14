class LRUCache {
    HashMap <Integer, Integer> map = new HashMap<>();
    Queue <Integer> queue = new LinkedList<>();
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        queue.remove(key);
        queue.add(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            queue.remove(key);
        } else if(queue.size() == capacity) {
            int lru = queue.poll();
            map.remove(lru);
        }
        queue.add(key);
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */