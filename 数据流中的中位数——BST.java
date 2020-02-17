public class Solution {
    private TreeNode root = null;
    private int size = 0;
    private int cnt;
    private double median;
    
    public void Insert(Integer num) {
        root = Insert(root,num);
    }
    
    private TreeNode Insert(TreeNode node, int val){
        if(node == null){
            size++;
            return new TreeNode(val);
        }
        if(val < node.val) node.left = Insert(node.left,val);
        else node.right = Insert(node.right,val);
        return node;
    }
    
    public Double GetMedian() {
        int mid1 = (size+1)/2;
        int mid2 = (size+2)/2;
        cnt = 0;
        findK(root,mid1);
        cnt = 0;
        findK(root,mid2);
        return median/2;
    }
    
    private void findK(TreeNode root,int k){
        if(root == null || cnt > k) return;
        findK(root.left,k);
        cnt++;
        if(cnt == k) median += root.val;
        findK(root.right,k);
        return;
    }