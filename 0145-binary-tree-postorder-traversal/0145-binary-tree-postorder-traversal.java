

class Solution {
    
    public void Traversal(TreeNode t,List<Integer> l)
    {
      if(t==null)
      {
         return;
      }
      Traversal(t.left,l);
      Traversal(t.right,l);
      l.add(t.val);
  
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ls= new ArrayList<>();
        Traversal(root,ls);

       return ls;
    }
}