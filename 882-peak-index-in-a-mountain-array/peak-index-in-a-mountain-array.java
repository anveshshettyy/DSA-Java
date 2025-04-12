class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 1, max = 0;
        int left = 0, right = arr.length-1;
        while(left < right) {
            if(arr[left] > max) {
                max = arr[left];
                index = left;
            } 
            if(arr[right] > max) {
                max = arr[right];
                index = right;
            } 
            left++;
            right--;
        }
        return index;
    }
}