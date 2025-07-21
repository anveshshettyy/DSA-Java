class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        

        for(int i=0; i<groupSizes.length; i++) {
            
            if(groupSizes[i] != -1) {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);

                for(int j=i+1; j<groupSizes.length && arr.size() < groupSizes[i]; j++) {
                    if(groupSizes[j] != -1 && groupSizes[i] == groupSizes[j]) {
                        arr.add(j);
                        groupSizes[j] = -1;
                    }
                }
                if (arr.size() == groupSizes[i])
                    list.add(arr);
            }   
        }

        return list;
        
    }
}