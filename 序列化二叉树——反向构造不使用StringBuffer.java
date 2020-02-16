public class Solution {
    private String serializedStr;
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
    TreeNode Deserialize(String str) {
        
        serializedStr = str;
        return preOrderBuilder();
        }
    
    private TreeNode preOrderBuilder(){
        if(serializedStr.length() == 0) return null;
        if(serializedStr.charAt(0) == '#'){
            serializedStr = serializedStr.substring(1);
            return null;
        }
        int index = serializedStr.indexOf('!');
        String str = serializedStr.substring(0,index);
        serializedStr = serializedStr.substring(index+1);
        TreeNode node = new TreeNode(Integer.valueOf(str));
        node.left = preOrderBuilder();
        node.right = preOrderBuilder();
        return node;
    }
}