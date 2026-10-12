//taken help from Chatgpt

class Solution {

    public void traverse(TreeNode root,List<Integer> x)
    {
        if(root==null)
        {
            return;
        }

        traverse(root.left,x);
        x.add(root.val);
        traverse(root.right,x);

    }


    public List<Integer> inorderTraversal(TreeNode root) {

     List<Integer> list = new ArrayList();

           traverse(root,list);

            return list;     
    }
}