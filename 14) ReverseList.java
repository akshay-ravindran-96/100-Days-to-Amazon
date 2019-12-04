/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr =head;
        ListNode prev =null;
        ListNode next =curr;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next =prev;
            prev =curr;
            curr =next;
            
            
        }
        head = prev;
        return head;
        
    }
}
