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
    public void reorderList(ListNode head) {
        if(head==null || head.next == null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        while(curr != null){
           ListNode nextNode=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nextNode;  
        }
        ListNode lefthead=head;
        ListNode righthead=prev;

        while(lefthead != null && righthead != null){
            ListNode t1=lefthead.next;
            ListNode  t2=righthead.next;

            lefthead.next=righthead;
            righthead.next=t1;

            lefthead=t1;
            righthead=t2;
        } 
    }
}