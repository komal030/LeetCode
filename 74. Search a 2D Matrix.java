class Solution {
  public boolean searchMatrix(int[][] matrix, int x) {
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m; i++) {
      if (matrix[i][0] <= x && matrix[i][n - 1] >= x) {
        int l = 0, r = n - 1;
        while (l <= r) {
          int mid = (l + r) / 2;
          if (matrix[i][mid] == x)
            return true;
          else if (matrix[i][mid] > x)
            r = mid - 1;
          else
            l = mid + 1;
        }
      }
    }
    return false;
  }
}
