class Solution {
  public int numDecodings(String s) {
    if (s.charAt(0) == '0') return 0;
    if (s.length() == 1)
      return 1;

    int n = s.length();
    int[] arr = new int[n + 1];
    Arrays.fill(arr, 1);
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == '0') {
        arr[i] = 0;
      } else
        arr[i] = arr[i + 1];
      if (i + 1 < n && ((s.charAt(i) == '1') || (s.charAt(i) == '2' && s.charAt(i + 1) >= '0' && s.charAt(i + 1) < '7'))) {
        arr[i] += arr[i + 2];
      }
    }
    return arr[0];
  }
}
