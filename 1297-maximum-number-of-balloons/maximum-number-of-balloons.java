class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        // int count =0;
        // for(int i= 0; i<str.length(); i++) {
        //     if(str.charAt(i) == 'b' || str.charAt(i) == 'a' || str.charAt(i) == 'l' || str.charAt(i) == 'o' || str.charAt(i) == 'n') {
        //         count++;
        //         if(hashMap.containsKey(str.charAt(i))) {
        //             int n = hashMap.get(str.charAt(i)) + 1;
        //             hashMap.put(str.charAt(i), n);
        //         } else {
        //             hashMap.put(str.charAt(i), 1);
        //         }
        //     }
        // }

        hashMap.put('b', 0);
        hashMap.put('a', 0);
        hashMap.put('l', 0);
        hashMap.put('o', 0);
        hashMap.put('n', 0);


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (hashMap.containsKey(c)) {
            hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        int maxBalloons = Math.min(hashMap.get('b'),
        Math.min(hashMap.get('a'),
        Math.min(hashMap.get('n'),
        Math.min(hashMap.get('l') / 2,
        hashMap.get('o') / 2))));

        return maxBalloons;

    }
}