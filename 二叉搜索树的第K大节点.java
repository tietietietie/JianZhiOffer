public class Solution {
    private int cnt;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        cnt = 0;
        return inorder(pRoot,k);
    }
    
    private TreeNode inorder(TreeNode root, int k){
        if(root == null) return null;
        TreeNode left = inorder(root.left,k);
        if(left != null) return left;
        cnt++;
        if(cnt == k) return root;
        TreeNode right = inorder(root.right,k);
        return right;
    }
}