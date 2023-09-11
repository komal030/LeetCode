class Solution {
   int smin = Integer.MAX_VALUE;
   boolean f=false;
   public int findSecondMinimumValue(TreeNode root) {
      if (root == null || root.left == null && root.right == null)
         return -1;
      int min = root.val;
      find(root, min);
      if (smin == Integer.MAX_VALUE && f==false)
         return -1;
      else
         return smin;
   }

   public void find(TreeNode root, int min) {
      if (root == null)
         return;
      if (root.val > min && root.val <=smin)
      {
         smin = root.val;
         f=true;
      }
      find(root.left, min);
      find(root.right, min);
   }
}
