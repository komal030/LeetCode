class Solution {
  public String longestPalindrome(String s) {
    int n = s.length(),p = 0;
    String temp = "";
    for (int i = 0; i < n; i++) {
      int l = i;
      int r = i;
      while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
        if (r - l + 1 > p) {
          temp = s.substring(l, r + 1);
          p = r - l + 1;
        }
        l--;
        r++;

      }
    }
    for (int i = 0; i < n; i++) {
      int l = i;
      int r = i + 1;
      while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
        if (r - l + 1 > p) {
          temp = s.substring(l, r + 1);
          p = r - l + 1;
        }
        l--;
        r++;

      }
    }
    return temp;
  }
}
