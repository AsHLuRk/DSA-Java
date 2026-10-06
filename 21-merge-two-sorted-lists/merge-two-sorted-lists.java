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
        if(list1 ==null && list2==null){
            return null;
        }
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ans.next = temp1;
                temp1 = temp1.next;
                ans = ans.next;
            }
            else{
                
                ans.next = temp2;
                temp2 = temp2.next;
                ans = ans.next;
            }
        }
        if(temp1!=null){
            ans.next = temp1;
        }
        if(temp2!=null){
            ans.next = temp2;
        }
      return dummy.next;
    }
}