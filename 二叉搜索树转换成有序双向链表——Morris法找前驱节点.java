public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        TreeNode pre = pRootOfTree;
                //找到链表的头节点保存
        while(pre.left != null){
            pre = pre.left;
        }
        TreeNode nHead = pre;

        //从头节点开始，将BST变成右叉树BST
        pre = pRootOfTree;
        while(pre.left != null || pre.right != null){
            if(pre.left != null){
                findMax(pre.left).right = pre;
                TreeNode temp = pre.left;
                pre.left = null;
                pre = temp;
            }
            else if(pre.right != null && pre.right.left != null){
                findMax(pre.right.left).right = pre.right;
                TreeNode temp = pre.right.left;
                pre.right.left = null;
                pre.right = temp;
            }
            else{
                pre = pre.right;
            }
        }

        //将右叉树变成双向链表
        pre = nHead;
        while(pre.right != null){
            pre.right.left = pre;
            pre = pre.right;
        }
        return nHead;
    }
    //找到BST的最大节点
    private TreeNode findMax(TreeNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }
}