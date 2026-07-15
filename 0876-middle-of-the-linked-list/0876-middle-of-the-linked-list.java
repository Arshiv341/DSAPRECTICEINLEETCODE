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
    public static ListNode mid(ListNode head){
        ListNode midN=head;
        int mid=0;
        ListNode temp=head;
        while(temp!=null){
            mid++;
            temp=temp.next;
        }
        mid=mid/2;
        for(int i=0; i<mid;i++){
            midN=midN.next;
        }
        return midN;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp =mid(head);
        return temp;
        
    }
}