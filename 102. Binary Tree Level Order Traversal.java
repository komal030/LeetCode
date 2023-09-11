class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> res=new ArrayList<>();
    
     Queue<TreeNode> queue = new ArrayDeque<>();
     if(root==null)
     return res;
     queue.add(root);
     while(!queue.isEmpty())
     {
          List<Integer> list=new ArrayList<>();
         int n=queue.size();
         for(int i=0;i<n;i++)
         {
            TreeNode temp=queue.remove();
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
            list.add(temp.val);
         }
         res.add(list);
     }   
     return res;
    }
}
