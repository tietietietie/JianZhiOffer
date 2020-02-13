public class Solution {
    private int ans = 0;
    public int TreeDepth(TreeNode root) {
        preorder(root,0);
        return ans;
    }
    
    private void preorder(TreeNode node, int depth){
        if(node == null) return;
        depth++;
        ans = Math.max(ans,depth);
        preorder(node.left,depth);
        preorder(node.right,depth);
    }
}