class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] digitCount = count(n);
        int a = 1;
        for(int i=0;i<30;i++){
            int[] powerDigitCount = count(a);
            if(Arrays.equals(digitCount,powerDigitCount)){
                return true;
            }
            a = a<<1;
        }
        return false;
    }

    public int[] count(int n){
        int[] arr = new int[10];
        while(n>0){
            arr[n%10]++;
            n = n/10;
        }
        return arr;
    }
}