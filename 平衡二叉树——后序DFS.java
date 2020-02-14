//import java.util.Math;
public class Solution {
    private boolean ans = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        postOrder(root);
        return ans;
    }
    private int postOrder(TreeNode root){
        if(root == null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        if(Math.abs(left-right) > 1) this.ans = false;
        return Math.max(left,right)+1;
    }
}