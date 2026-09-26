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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
          ListNode n1 = l1 ;
          ListNode n2 = l2;
          ListNode dummy= new ListNode(0);
          ListNode ans = dummy;
         
         int carry =0;
          
          while(n1!=null && n2!=null){
            if(n1.val + n2.val +carry <10){
                ans.next = new ListNode(n1.val+ n2.val +carry);
                ans = ans.next;
                carry = 0;
            }
            else{
               int x = (n1.val+n2.val+carry)/10;
               ans.next = new ListNode((n1.val+n2.val+carry)%10);
               ans = ans.next;
               carry  = x;

            }
            n1 = n1.next;
            n2 = n2.next;
          }
          if(n1!=null){
            while(n1!=null){
                  if(n1.val+carry <10){
               ans.next = new ListNode(n1.val +carry);
               ans = ans.next;
               carry = 0;
            }
            else{
               int x = (n1.val+carry)/10;
               ans.next = new ListNode((n1.val+carry)%10);
               ans = ans.next;
               carry  = x;
            }
            n1 = n1.next;
            }
          }
          if(n2!=null){
            while(n2!=null){
                if(n2.val+carry <10){
                ans.next = new ListNode( n2.val +carry);
                ans = ans.next;
                carry = 0;
            }
            else{
               int x = (n2.val+carry)/10;
               ans.next = new ListNode((n2.val+carry)%10);
               ans = ans.next;
               carry  = x;
            }
            n2 = n2.next;
            }
          }
          if(carry!=0){
            
           ans.next = new ListNode(carry);
          }

        return dummy.next;  

        // ListNode dummy= new ListNode(0);
        //   ListNode ans = dummy;
         
        //  int carry =0;

        //  while(l1!=null || l2!=null || carry!=0){

        //     int sum = carry;

        //     if(l1!=null){
        //         sum+= l1.val;
        //         l1 = l1.next;
        //     }

        //     if(l2!=null){
        //         sum+= l2.val;
        //         l2 = l2.next;
        //     }

        //      carry = sum/10;
        //     ans.next= new ListNode(sum%10);
        //     ans = ans.next;
        //  }

        // return dummy.next;


    }
}