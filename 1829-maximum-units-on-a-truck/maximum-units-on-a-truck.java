class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int sum = 0;
        for(int i=0; i<boxTypes.length; i++) {
            if(boxTypes[i][0] <= truckSize) {
                truckSize -= boxTypes[i][0];
                sum += boxTypes[i][0] * boxTypes[i][1];
            } else {
                sum += truckSize * boxTypes[i][1];
                break;
            }
        }

        return sum;
    }
}