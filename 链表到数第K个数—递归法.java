public class Solution {
    private int count,k;
    private ListNode ans;
    public ListNode FindKthToTail(ListNode head,int k) {
        this.count = 0;
        this.k = k;
        this.ans = null;
        FindKthToTail(head);
        return ans;
    }
    
    private void FindKthToTail(ListNode head){
        if(head == null) return;
        FindKthToTail(head.next);
        this.count++;
        if(this.count == this.k) this.ans = head;
        return;
    }
}