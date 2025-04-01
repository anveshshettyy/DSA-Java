class Solution {
    // static void Merge(int nums[], int l, int mid, int r) {
    //     int n1 = 1 + mid - l;
    //     int n2 = r - mid; 

    //     int left[] = new int[n1];
    //     int right[] = new int[n2];

    //     for(int i=0; i<n1; i++) left[i] = nums[i+l];
    //     for(int i=0; i<n2; i++) right[i] = nums[mid+i+1];

    //     int i=0, j=0, k=l;
    //     while(i<n1 && j<n2) {
    //         if(left[i] < right[j]) nums[k++] = left[i++];
    //         else nums[k++] = right[j++];
    //     }

    //     while(i<n1) nums[k++] = left[i++];
    //     while(j<n2) nums[k++] = right[j++];
    // }
    // static void MergeSort(int nums[], int l, int r) {
    //     if(l>=r) return;
    //     int mid = (r+l) / 2;
    //     MergeSort(nums,l, mid);
    //     MergeSort(nums,mid+1, r);
    //     Merge(nums, l, mid, r);
    // }
    public int[] sortArray(int[] nums) {
        // MergeSort(nums, 0, nums.length-1);
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
}