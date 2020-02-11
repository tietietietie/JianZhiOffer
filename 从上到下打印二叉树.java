public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
        TreeNode cur = queue.poll();
        ans.add(cur.val);
        if(cur.left != null) queue.offer(cur.left);
        if(cur.right != null) queue.offer(cur.right);
        }
        return ans;
    }
}