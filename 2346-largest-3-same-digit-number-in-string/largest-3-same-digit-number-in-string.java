class Solution {
    public String largestGoodInteger(String num) {
        // int arr[] = new int[10];
        // ArrayList<Integer> li = new ArrayList<>();
        PriorityQueue<Integer> li = new PriorityQueue<>(Collections.reverseOrder());
        char res = 'a';
        int count = 0;
        for(char c: num.toCharArray()) {
            if(res == c) count++;
            else {
                res = c;
                count = 1;
            }
            if(count == 3) li.add(c-'0');
        }
        if(li.isEmpty()) return "";
        int largest = li.poll();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<3; i++) result.append(largest);
        return result.toString();
    }
}