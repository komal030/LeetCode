class Solution {

  public int maxProduct(int[] arr) {
    int n = arr.length;
    int prod = arr[0], max = arr[0], min = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] < 0) {
        int temp = max;
        max = min;
        min = temp;
      }
      max = Math.max(arr[i], max * arr[i]);
      min = Math.min(arr[i], min * arr[i]);
      prod = Math.max(prod, max);
    }
    return prod;
  }

}
