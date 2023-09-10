class Solution {
  public List < Integer > spiralOrder(int[][] matrix) {
    int k = 0;
    int m = matrix.length;
    int n = matrix[0].length;
    List < Integer > list = new ArrayList < > ();
    int a = 0, b = 0, c = m - 1, d = n - 1;
    while (k < m * n) {
      for (int i = b; i <= d; i++) {
        list.add(matrix[a][i]);
        k++;
      }

      if (k == m * n)
        break;
      a++;
      for (int i = a; i <= c; i++) {
        list.add(matrix[i][d]);
        k++;
      }

      if (k == m * n)
        break;
      d--;
      for (int i = d; i >= a; i--) {
        list.add(matrix[c][i]);
        k++;
      }

      if (k == m * n)
        break;
      c--;
      for (int i = c + 1; i >= b + 1; i--) {
        list.add(matrix[i][a - 1]);
        k++;
      }
      b++;
    }
    return list;
  }
}
