class Solution1 
{
    int max =0;
    
    public int longestZigZag(TreeNode root) 
    {
        helper(root.right, 1, true);//i am going to right subtree here so isright is true
        helper(root.left, 1, false);//it is not right, so pass isright=false
        
        return max;        
    }
    
    public void helper(TreeNode root,int pathLength, boolean isRight)
    {
        if(root==null)
            return;
        
        max = Math.max(max, pathLength);
        
        if(isRight)//if it is coming from the right, I need to go left
        {
            helper(root.left, pathLength+1, false);
            helper(root.right, 1, true); //check for longer alternative starting from this node;
        }
        
        else
        {
            helper(root.right, pathLength+1, true);
            helper(root.left, 1, false); //check for longer alternative starting from this node;  
        }
    }
}
