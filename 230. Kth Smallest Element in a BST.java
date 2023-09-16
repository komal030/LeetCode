class Solution {
       
    public int kthSmallest(TreeNode root, int k) {
        int arr[]={0};    
        return find(root,k,arr);
    }
    public int find(TreeNode node,int k,int arr[])
    {
        if(node==null)
        return 0;
        int left= find(node.left,k,arr);
        if(left!=0)
        return left;
        arr[0]+=1;
        if(arr[0]==k)
        return node.val;
        return find(node.right,k,arr);
        
       // return 0;

    }
}
