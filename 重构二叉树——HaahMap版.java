import java.util.Map;
import java.util.HashMap;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < in.length; i++){
            map.put(in[i],i);
        }
        TreeNode root = reConstructBT(0,pre.length-1,0,pre,map);
        return root;
    }
    
    private TreeNode reConstructBT(int left, int right,int inL, int[] pre, Map<Integer,Integer> map){
        if(left > right) return null;
        TreeNode root = new TreeNode(pre[left]);
        int leftTreeSize = map.get(pre[left]) - inL;
        root.left = reConstructBT(left+1,left+leftTreeSize,inL,pre,map);
        root.right = reConstructBT(left+leftTreeSize+1,right,inL+leftTreeSize+1,pre,map);
        return root;
    }
}