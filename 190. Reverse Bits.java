public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int rev = 0;
    for (int i = 0; i < 32; i++) {
      int dig = (n >> i) & 1;
      rev = (rev << 1) | dig;

    }
    return rev;
  }
}
