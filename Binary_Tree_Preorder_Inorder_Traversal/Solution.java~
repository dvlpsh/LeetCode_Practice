class Solution 
{
    int preIndex;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        preIndex = 0;
        
        for(int i =0; i<inorder.length; i++)
            map.put(inorder[i], i);
        
        return buildT(preorder, inorder, 0, inorder.length-1);
    }
    
    
    public TreeNode buildT(int pre[], int in[], int inStart, int inEnd)
    {
        
        if(inStart>inEnd)
            return null;
        
        
        TreeNode node = getNode(pre[preIndex++]); 
        
        if(inStart== inEnd)
            return node;
        
        int inIndex = map.get(node.val);
        //findInorderIndex(in, node.val, start, end); //inorder index of current node
        
        node.left = buildT(pre, in, inStart, inIndex-1);
        node.right = buildT(pre, in, inIndex+1, inEnd);
        
        return node;
    }
    
   /* public int findInorderIndex(int in[], int val, int start, int end)
    {
        for(int i = start; i<=end; i++)
            if(in[i] == val)
                return i;
        return -1;//which is basically never returned but still keep it here        
    }*/
    
    public TreeNode getNode(int val)
    {
        TreeNode node = new TreeNode();
        node.left = null;
        node.right = null;
        node.val = val;
        
        return node;
    }
}
