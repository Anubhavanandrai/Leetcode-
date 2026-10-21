
class Solution {

    List<String> ls= new ArrayList<>();

    public void Traverse(TreeNode root,String str)
    {

         if(root==null)
        {
            return; 
        }

       if(root.left==null && root.right==null)
         {

              if(str.length()<1)
            {
            str=str+ Integer.toString(root.val);
            ls.add(str);
            return;
             }
             str=str+"->";
             str=str+ Integer.toString(root.val);
            ls.add(str);
            return; 
         }
       
        
        if(str.length()<1)
        {
            str=str+ Integer.toString(root.val);
        }
        else{
           // String s=Integer.toString(root.val);
            str=str+"->";
            str=str+ Integer.toString(root.val);
        }
        Traverse(root.left,str);
        Traverse(root.right,str);

    }

    public List<String> binaryTreePaths(TreeNode root) {
      
       String sb="";
       Traverse(root,sb);
       return ls;
    }
}