
class Solution {
   public boolean check(TreeNode a1, TreeNode a2) {
      if (a1 == null && a2 == null)
         return true;
      if (a1 == null || a2 == null)
      return false;  
    return a1.val==a2.val && check(a1.left, a2.right) && check(a1.right, a2.left);
   }

   public boolean isSymmetric(TreeNode root) {
      if(root == null)
      return true;
      return check(root.left, root.right);
   }
}
