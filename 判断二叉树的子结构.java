public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null ||root2 == null) return false;
        if(isSubtree(root1,root2)) return true;
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    
    private boolean isSubtree(TreeNode node1, TreeNode node2){
        if(node2 == null) return true;
        if(node1 == null) return false;
        if(node1.val != node2.val) return false;
        return isSubtree(node1.left,node2.left) && isSubtree(node1.right,node2.right);
    }
}