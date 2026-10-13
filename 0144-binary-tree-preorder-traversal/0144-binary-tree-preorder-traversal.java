
//Today i have learnt such an amazing concept that i cant tell you how easy recursion has now become my whole persepective got changed

//Recursion is not hard i used to make it hard because i used to think i dont know how

//Simple step: 1. what to do 2. Repeat 

//done this is all recursion


class Solution {
    
    public void Traversal(TreeNode t,List<Integer> l)
    {
      if(t==null)
      {
         return;
      }
      l.add(t.val);
      Traversal(t.left,l);
      Traversal(t.right,l);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ls= new ArrayList();
        Traversal(root,ls);

       return ls;
    }
}