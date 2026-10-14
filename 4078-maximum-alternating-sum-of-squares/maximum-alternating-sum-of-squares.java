class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer[] arr = Arrays.stream(nums)
                              .boxed()
                              .toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) ->
            Long.compare(Math.abs((long) a), Math.abs((long) b))
        );

        long sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            long square = (long) arr[i] * arr[i];

            if (i < n / 2) {
                sum -= square;
            } else {
                sum += square;
            }
        }

        return sum;
    }
}