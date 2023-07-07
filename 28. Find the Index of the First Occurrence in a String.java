class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l = needle.length();
        for(int i = 0; i < n; i++) {
            int j = 0;
            int p = i;
            while (j < l) {
                if (needle.charAt(j) == haystack.charAt(i)) {
                    i++;
                    j++;
                } 
                else
                    break;     
            }
            if (j == l)
                return p;
        }
        return -1;
    }
}
