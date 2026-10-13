
class Solution {

    public int Traverse(TreeNode root){
    if(root==null)
    {
        return 0;
    }
    int x= 1+Traverse(root.left);
    int y= 1+Traverse(root.right);

    return Math.max(x,y);
 
    }
    public int maxDepth(TreeNode root) {
         int max=0;
          max= Traverse(root);
         return max;
       
    }
}