public class Solution {
    private String deserializedStr;
    public String Serialize(TreeNode root) {
        if(root == null) return "#";
        return root.val + "!" + Serialize(root.left) + Serialize(root.right);
    }

    public TreeNode Deserialize(String str) {
       deserializedStr = str;
       return Deserialize();
    }

    private TreeNode Deserialize(){
        if(deserializedStr.length() == 0) return null;
        if(deserializedStr.charAt(0) == '#'){
            deserializedStr = deserializedStr.substring(1);
            return null;
        }
        int index = deserializedStr.indexOf("!");
        String stringVal = deserializedStr.substring(0,index);
        deserializedStr = deserializedStr.substring(index+1);
        int val = Integer.valueOf(stringVal);
        TreeNode node = new TreeNode(val);
        node.left = Deserialize();
        node.right = Deserialize();
        return node;
    }
}