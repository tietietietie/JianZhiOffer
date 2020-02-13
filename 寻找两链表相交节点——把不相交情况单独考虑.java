public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2 = pHead2;
        if(p1 == null || p2 == null) return null;
        while(p1 != p2){
            if(p1.next == null && p2.next == null) return null;
            if(p1.next == null)
                p1 = pHead2;
            else
                p1 = p1.next;
            if(p2.next == null)
                p2 = pHead1;
            else
                p2 = p2.next;
        }
        return p1;
    }
}