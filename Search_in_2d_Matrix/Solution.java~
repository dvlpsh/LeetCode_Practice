class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        if(matrix.length == 0)
            return false;
        
        int n = matrix.length;//no of rows
        int m = matrix[0].length;
        
        int i =0, j=m-1;
        
        while(i<n && j>=0)
        {
            if(target>matrix[i][j])//go down as to left is all < target
                i++;
            else if(target<matrix[i][j]) //go left as all smaller values are present
                j--;
                
            else if(target==matrix[i][j])
                return true;                
        }
        
        return false;        
    }
}
