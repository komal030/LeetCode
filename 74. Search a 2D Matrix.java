class Solution {
  public boolean searchMatrix(int[][] matrix, int x) {
    int m = matrix.length;
    int n = matrix[0].length;
        int l= 0, r = m*n - 1;
    
        while (l <= r) {
          int mid=(l+(r-l)/2);
          int midr = mid / n;
          int midc=mid-midr*n;

          if (matrix[midr][midc] == x)
            return true;
          else if (matrix[midr][midc] > x)
            r = mid - 1;
          else
            l = mid + 1;
        }   
    return false;
  }
}
