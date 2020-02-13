public class Solution {
    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inorder(pRootOfTree);
        return head;
    }
    private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        node.left = pre;
        if(pre != null)
            pre.right = node;
        pre = node;
        //第一个节点设置为head
        if(head == null)
            head = pre;
        inorder(node.right);
        return;
    }
}