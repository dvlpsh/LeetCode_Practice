class Solution 
{
    int sum=0;
    
    public TreeNode bstToGst(TreeNode root)
    {
        bstToGst1(root);
        return root;
    }
    
    public void bstToGst1(TreeNode root) 
    {
        if(root.right!=null)
            bstToGst1(root.right); 
        /*start traversing from right, in that case you save yourself fro a treee traversal to get all the bigger values*/
        
        sum = sum + root.val; 
        root.val = sum;
        
        if(root.left!=null)
            bstToGst1(root.left);
            
    }
}
