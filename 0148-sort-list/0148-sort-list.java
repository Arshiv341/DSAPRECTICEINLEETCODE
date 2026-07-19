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
    public ListNode sortList(ListNode head) {
        ListNode dummy =new ListNode(0);
        ArrayList<Integer>arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
        ListNode temp=dummy;
        for(int i=0;i<arr.size();i++){
            temp.next=new ListNode(arr.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
}