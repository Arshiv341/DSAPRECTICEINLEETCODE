/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2=headB;
        int l1=0;
        int l2=0;
        while(temp1!=null || temp2!=null){
            if(temp1!=null){
                l1++;
                temp1=temp1.next;
            }
            if(temp2!=null){
                l2++;
                temp2=temp2.next;
            }
        }
        temp1=headA;
        temp2=headB;
        int d = l1-l2;
        if(d>0){
            for(int i=0;i<d;i++){
                temp1=temp1.next;
            }
        }
        else{
            d=-d;
            for(int i=0;i<d;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}