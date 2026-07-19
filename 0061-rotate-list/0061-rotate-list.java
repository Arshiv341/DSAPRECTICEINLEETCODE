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
    public static int len(ListNode head){
        ListNode temp =head;
        int n = 0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int n =len(head);
        if(n==0)return head;
        k%=n;
         if(k==0||n==0)return head;
        
        ListNode slow= head;
        ListNode fast = head;
        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a = slow.next;
        slow.next=null;
        ListNode tail =a;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        return a;
    }
}