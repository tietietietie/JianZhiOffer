public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(pRoot == null) return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            int cnt = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            while(cnt > 0){
                cnt--;
                TreeNode cur = queue.poll();
                level.add(cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
            ans.add(level);
        }
        return ans;
    }
}