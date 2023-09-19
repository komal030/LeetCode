class Solution {
    public int deepestLeavesSum(TreeNode root) {
      Queue<TreeNode> q=new ArrayDeque<>();
      q.add(root);  
      int sum=0;
      while(!q.isEmpty())
      {
          sum=0;
          int n=q.size();
          for(int i=0;i<n;i++)
          {
            TreeNode temp=q.poll();
            sum+=temp.val;
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
          }
      }
      return sum;
    }
}
