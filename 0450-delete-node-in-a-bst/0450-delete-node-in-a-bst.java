class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val){
            root.left=deleteNode(root.left,key);
            return root;
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
            return root;
        }
        else{
            //left child
            if(root.left == null && root.right==null){
                return null;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }else if(root.left ==null && root.right != null ){
                return root.right;
            }
            else{
                int min=getMin(root.right);//get min in right subtree
                root.val=min;
                root.right=deleteNode(root.right,min);
                return root;
            }
            
        }
    }
    public int getMin(TreeNode root){
        if(root.left==null) return root.val;
        return getMin(root.left);
    }
    
}