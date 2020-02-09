import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        recursivelyPrint(listNode,ans);
        return ans;
    }
    private void recursivelyPrint(ListNode listNode, ArrayList<Integer> ans){
        if(listNode == null) return;
        recursivelyPrint(listNode.next,ans);
        ans.add(listNode.val);
        return;
    }
}