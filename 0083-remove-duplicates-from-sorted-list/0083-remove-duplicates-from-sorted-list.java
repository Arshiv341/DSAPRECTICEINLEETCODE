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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp =head;
        ListNode dif = head;
        while(dif!=null){
            if(temp.val!=dif.val){
                temp.next  = dif;
                temp=temp.next;
            }
            dif=dif.next;
        }
        temp.next=dif;
        return head;
    }
}