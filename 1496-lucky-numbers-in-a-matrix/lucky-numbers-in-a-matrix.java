class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        // int minRow[] = new int[matrix[0].length];
        // int maxCol[] = new int[matrix.length];
        ArrayList<Integer> minRow = new ArrayList<>();
        ArrayList<Integer> maxCol = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                // min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[j][i]);
            }
            maxCol.add(max);
        }

        for (int i = 0; i < matrix.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minRow.add(min);
        }

        System.out.println(maxCol);
        System.out.println(minRow);

        // for (int i = 0; i < maxCol.size(); i++) {
        //     for (int j = 0; j < minRow.size(); j++) {
        //         if (maxCol.get(i).equals(minRow.get(j))) {
        //             result.add(minRow.get(j));
        //             return result;
        //         }
        //     }
        // }

        int resMin = Collections.min(maxCol);
        int resMax = Collections.max(minRow);

        if(resMin == resMax) {
            result.add(resMin);
                return result;
        }

        return result;

    }
}