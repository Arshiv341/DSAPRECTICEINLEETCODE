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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        ArrayList<Integer>arr=new ArrayList<>();
        while(list1!=null || list2!=null){
            if(list1!=null){
                arr.add(list1.val);
                list1=list1.next;
            }
            if(list2!=null){
                arr.add(list2.val);
                list2=list2.next;
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            temp.next= new ListNode(arr.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
}