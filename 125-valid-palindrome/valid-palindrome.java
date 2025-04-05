class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char ch[] = s.toCharArray();

        ArrayList <Character> res = new ArrayList<Character>();
        for(int i=0; i<ch.length; i++) {
            if((ch[i] >= 97 && ch[i] <= 122) || ( ch[i] >= 48 && ch[i] <= 57))
                res.add(ch[i]);
        }

        System.out.println(res);

        int left = 0, right = res.size() - 1;
        while(left < right) {
            if(res.get(left) != res.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}