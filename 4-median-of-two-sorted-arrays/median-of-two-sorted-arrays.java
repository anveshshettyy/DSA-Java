class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        for(int i:nums1) 
            al.add(i);

        for(int i:nums2) 
            al.add(i);
        
        Collections.sort(al);

        int size = al.size();
        double median = 0;
       
        median = (size%2 == 0) ? (al.get(size/2) + al.get((size/2)-1))/2.0 :al.get(size/2);
        return median;
    }
}