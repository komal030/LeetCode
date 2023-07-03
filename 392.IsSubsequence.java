class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            int f = 0;
            for (int j = k; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(i)) {
                    k = j + 1;
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                return false;

        }
        return true;
    }
}
