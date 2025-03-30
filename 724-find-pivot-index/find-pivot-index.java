class Solution {
    // static int mid(int nums[], int mid) {
    //     int sum1 = 0, sum2 = 0;
    //     for(int i=0; i<mid; i++) 
    //         sum1 += nums[i];

    //     for(int i=mid; i<nums.length; i++) 
    //         sum2 += nums[i];
        
    //     return (sum1 == sum2) ? mid : -1;
        
    // }
    public int pivotIndex(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];

            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }
}