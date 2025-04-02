class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        int l = address.length();

        for(int i=0; i<l; i++) {
            if(address.charAt(i) == '.') {
                res.append('[');
                res.append('.');
                res.append(']');
            } else {
                res = res.append(address.charAt(i));
            }
        }
        String b = res.toString();
        return b;
    }
}