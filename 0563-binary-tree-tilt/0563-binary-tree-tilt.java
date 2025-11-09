class Solution {
    int ans=0;
    public int sum(TreeNode root){
        if(root==null) return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        ans+=Math.abs(left-right);
        return left+right+root.val;
    }
    public int findTilt(TreeNode root) {
        sum(root);
        return ans;
    }
}