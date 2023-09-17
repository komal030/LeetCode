class Solution {
  public List < Integer > rightSideView(TreeNode root) {
   List < Integer > list = new ArrayList < > ();
    if (root == null)
      return list;
    Queue < TreeNode > queue = new ArrayDeque < > ();
    
    queue.add(root);
    while (!queue.isEmpty()) {
      int n = queue.size();
      for (int i = 0; i < n; i++) {
        TreeNode t = queue.poll();
        if (i == n - 1) {
          list.add(t.val);
        }
        if (t.left != null) 
            queue.add(t.left);
        if (t.right != null) 
            queue.add(t.right);
        
      }
    }
    return list;
  }

}
