import java.util.LinkedList;
import java.util.Arrays;

public class Solution {
    String Serialize(TreeNode root) {
        StringBuffer ans = new StringBuffer("");
        preorder(root,ans);
        return ans.toString();
  }
    private void preorder(TreeNode root, StringBuffer ans){
        if(root == null){
            ans.append("#");
            return;
        }
        ans.append(Integer.toString(root.val));
        ans.append("!");
        preorder(root.left,ans);
        preorder(root.right,ans);
        return;
    }
//bug!!
    TreeNode Deserialize(String str) {
        
        LinkedList<Character> chars = new LinkedList<>(Arrays.asList(str.toCharaterArray()));
        return preOrderBuilder(chars);
        }
    
    private TreeNode preOrderBuilder(LinkedList<> chars){
        if(chars.isEmpty()) return null;
        if(chars.getFirst() == "#"){
            chars.removeFirst();
            return null;
        }
        StringBuffer temp = new StringBuffer();
        while(chars.getFirst != null){
            temp.append(chars.removeFirst());
        }
        String str = temp.toString();
        TreeNode node = new TreeNode(Integer.valueOf(str));
        node.left = preOrderBuilder(chars);
        node.right = preOrderBuilder(chars);
        return node;
    }
}