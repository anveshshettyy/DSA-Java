class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // if(queue.size() == 0) {
        //     queue.add(t);
        //     return 1;
        // } else {
        //     if(t <= 3000) {
        //         queue.add(t);
        //     } else {
        //         int margin = t - 3000 ;
        //         while(queue.size() != 0 && queue.peek() < margin) {
        //             queue.poll();
        //         }
        //         queue.add(t);
        //     }
        //     return queue.size();
        // }
        queue.add(t);
        while(queue.peek()  < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */