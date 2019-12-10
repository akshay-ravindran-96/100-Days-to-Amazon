/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode res = null;
        ListNode prev = null; 
        ListNode temp = null; 
        int carry = 0, sum; 
  
        while (first != null || second != null)
        { 
            sum = carry + (first != null?first.val : 0)+(second != null ? second.val : 0); 
            carry = (sum >= 10) ? 1 : 0; 
            sum = sum % 10; 
            temp = new ListNode(sum); 
   
            if (res == null) res = temp;
            else  prev.next = temp; 
            
            prev = temp; 
            if (first != null)
                first = first.next; 
            if (second != null)
                second = second.next; 
        } 
  
        if (carry > 0)
            temp.next = new ListNode(carry);   
        return res; 
    }
}
