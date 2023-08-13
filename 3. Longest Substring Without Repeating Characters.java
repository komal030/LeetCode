class Solution {
  public int lengthOfLongestSubstring(String s) {
    int count = 1;
    int n = s.length();
    if (n == 0)
      return 0;
    HashMap < Character, Integer > map = new HashMap < > ();
    map.put(s.charAt(0), 0);
    int l = 0;
    int r = 1;
    while (r < n) {
      if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
        l = map.get(s.charAt(r)) + 1;
      }
      map.put(s.charAt(r), r);
      count = Math.max(count, r - l + 1);
      r++;
    }
    return count;
  }
}
