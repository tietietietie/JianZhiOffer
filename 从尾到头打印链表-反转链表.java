import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode newHead = reverse(listNode);
        ListNode cur = newHead;
        ArrayList<Integer> ans = new ArrayList<>();
        while(cur != null){
            ans.add(cur.val);
            cur = cur.next;
        }
        return ans;
    }
    
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}