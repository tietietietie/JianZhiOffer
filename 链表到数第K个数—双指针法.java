public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k < 1) return null;
        ListNode slowHead = head;
        ListNode fastHead = head;
        for(int i = 0; i < k-1; i++){
            if(fastHead.next == null) return null;
            fastHead = fastHead.next;
        }
        while(fastHead.next != null){
            fastHead = fastHead.next;
            slowHead = slowHead.next;
        }
        return slowHead;
    }
}