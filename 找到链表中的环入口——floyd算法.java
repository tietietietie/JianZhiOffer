public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode slow1 = pHead;
                while(slow1 != slow){
                    slow1 = slow1.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}