class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0, underscore_count = 0;
        for(char c: moves.toCharArray()) {
            if(c == 'L') count += 1;
            else if(c == 'R')count -= 1;
            else underscore_count += 1;
        }

        System.out.println(underscore_count);
        return Math.abs(count) + underscore_count;
    }
}