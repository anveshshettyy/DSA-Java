class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            if(x <= l - i){
                max = Math.max(x,max);
            }else{
                max = Math.max(max, l-i);
            }
        }
        return max;
        
    }
}