public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = pHead;
        ListNode pre = dummy;
        ListNode cur = pHead;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}