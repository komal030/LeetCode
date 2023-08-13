class Solution {
  public boolean searchMatrix(int[][] matrix, int x) {
    int m = matrix.length;
    int n = matrix[0].length;
    int l = 0, r = m - 1, mid = 0;

    while (l <= r) {
      mid = (l + r) / 2;
      if (matrix[mid][0] > x)
        r = mid - 1;
      else if (matrix[mid][n - 1] < x)
        l = mid + 1;
      //else if(matrix[mid][0] == x || matrix[mid][n-1] == x)
      //break;
      else break;
    }
    if (!(l <= r))
      return false;
    l = 0;
    r = n - 1;

    while (l <= r) {
      int mid1 = (l + r) / 2;
      if (matrix[mid][mid1] == x)
        return true;
      else if (matrix[mid][mid1] > x)
        r = mid1 - 1;
      else
        l = mid1 + 1;
    }

    return false;
  }
}
