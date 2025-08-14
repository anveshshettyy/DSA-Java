class Solution {
    public String largestGoodInteger(String num) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        char res = 'a';
        int count = 0;
        for(char c: num.toCharArray()) {
            if(res == c) count++;
            else {
                res = c;
                count = 1;
            }
            if(count == 3) maxHeap.add(c-'0');
        }
        if(maxHeap.isEmpty()) return "";
        int largest = maxHeap.poll();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<3; i++) result.append(largest);
        return result.toString();
    }
}