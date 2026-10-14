
class Solution {

    void Traverse(TreeNode x,List<Integer> ls)
    {
         if(x==null)
         {
            ls.add(null);
            return;
         }
         ls.add(x.val);
         Traverse(x.left,ls);
         Traverse(x.right,ls);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
      List<Integer> list1=new ArrayList<>();  
      Traverse(p,list1);
      List<Integer> list2=new ArrayList<>();  
      Traverse(q,list2);

      if(list1.size()!=list2.size())
      {
        return false;
      }
      else{

        for(int i=0;i<list1.size();i++)
        {
            if(!Objects.equals(list1.get(i), list2.get(i)))
            {
                return false;
            }
        }
      }
      return true;
    }
}