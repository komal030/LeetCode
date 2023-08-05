class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[][]=new int[r][c];
        if(m*n!=r*c)
        {
            return mat;
        }
        int p=0,q=0;
        for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
         {
         arr[p][q]=mat[i][j];
         q++;
         if(q==c)
         {
             q=0;
             p++;
         }
         }
        }
        return arr;
    }
}
