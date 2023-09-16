class Solution {
    int count=0;
    public int sumNumbers(TreeNode root) {
        return countT(root,0);
    }

    public int countT(TreeNode root,int num)
    {
        if(root==null)
        return 0;
        num=num*10+root.val;
        if(root.left==null&& root.right==null)
        return num;
        return countT(root.left,num)+countT(root.right,num);
    }
}
