class Solution {
    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isEnd = false;
    }

    public void insert(TrieNode root, String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new TrieNode();
            }
            curr = curr.child[idx];
        }
        curr.isEnd = true;
    }

    public String search(TrieNode root, String word) {
        TrieNode curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) {
                return word;
            }
            curr = curr.child[idx];
            if(curr.isEnd == true) {
                return word.substring(0, i+1);
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        for(String s: dictionary) {
            insert(root, s);
        }

        String arr[] = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s: arr) {
            res.append(search(root, s)).append(" ");
        }
        return res.toString().trim();

    }
}