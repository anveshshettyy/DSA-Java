class Solution {
    public int maxProduct(int[] nums) {
        // int r=0, l=0, n=nums.length;
        // int prod = 1, maxProd = Integer.MIN_VALUE;
        // while(r<n) {
        //     prod *= nums[r];
        //     while(prod <= 0 && l < r) {
        //         prod *= nums[l++];
        //     }
        //     maxProd = Math.max(maxProd, prod);
        //     r++;
        // }

        // return maxProd;

        int prod = 1, maxProd = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            prod = 1;
            for(int j=i; j<nums.length; j++) {
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
            
        }

        return maxProd;
    }
}