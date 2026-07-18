/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s = head;
        ListNode f = head;
        for(int i=0; i<k;i++){
            f=f.next;
        }
       ListNode x =f;
        while(f!=null){
            s=s.next;
            f=f.next;
        }
        f = head;
        for(int i=0; i<k-1;i++){
            f=f.next;
        }
        int y = f.val;
        f.val=s.val;
        s.val=y;
        return head;
    }
}