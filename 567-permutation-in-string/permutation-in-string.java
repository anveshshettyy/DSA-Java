class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        StringBuilder sortedS1 = new StringBuilder(new String(ch));
        StringBuilder str2 = new StringBuilder(s2);
    
        for(int i=0; i <= str2.length() - k; i++) {
            char[] temp = str2.substring(i, i+k).toCharArray();
            Arrays.sort(temp);
            String sortedS2 = new String(temp);

            if(sortedS2.equals(sortedS1.toString())) {
                return true;
            }
        }

        return false;
    }
}