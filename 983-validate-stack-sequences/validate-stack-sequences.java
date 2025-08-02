class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        
        Stack<Integer> st = new Stack<>();

        for(int num: pushed) {
            st.push(num);
            while(!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        } 
        
        return st.isEmpty();
    }
}