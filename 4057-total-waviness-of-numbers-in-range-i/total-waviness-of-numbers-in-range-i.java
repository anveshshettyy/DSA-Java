class Solution {
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for(int i=num1; i<=num2; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            res += checkCount(arr);
        }
        return res;
    }
    public int checkCount(char[] arr) {
        int count = 0;
        for(int i=1; i<arr.length-1; i++) {
            if((arr[i] < arr[i-1] && arr[i] < arr[i+1]) || (arr[i] > arr[i-1] && arr[i] > arr[i+1])) {
                count++;
            }
        }
        return count;
    }
}