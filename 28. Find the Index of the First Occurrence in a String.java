class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l = needle.length();
        if (l > n)
            return -1;
        int i = 0, j = 0, ch = 0;
        ;
        while (i < n) {
            ch = i;
            while (j < l && i < n && needle.charAt(j) == haystack.charAt(i)) {
                i++;
                j++;

            }
            if (j == l)
                return ch;
            else {
                j = 0;
                ich+1;
            }
        }
        return -1;
    }
}
