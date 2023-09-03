class Solution {
  public String longestPalindrome(String s) {
    int n = s.length();
StringBuffer sb=new StringBuffer();
    int start=0,end=0;
    int max=0;
    for (int i = 0; i < n; i++) {
      int l = i, r = i;
      while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
          if (r - l + 1 > max)
          {
          max=r + 1-l;
          start=l;
          end=r;
          }
          l--;
          r++;
        
      }
    }
    for (int i = 0; i < n; i++) {
      int l = i, r = i + 1;
      while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
          if (r - l + 1 > max)
          {
          max=r + 1-l;
          start=l;
          end=r;
          }
          l--;
          r++;
        }
      }
    return s.substring(start,end+1);
  }
}
