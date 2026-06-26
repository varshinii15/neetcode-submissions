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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode ptr=head;
        int l=0;
        while(ptr!=null){
            l++;
            ptr=ptr.next;
        }
        if(l==1 && n==1){
            return null;
        }

        ListNode newHead=reverse(head);
        ListNode temp=newHead;
        ListNode dummy=new ListNode(-1);
        dummy.next=newHead;
        ListNode prev=dummy;
        
        for(int i=1;i<n;i++){
            prev=temp;
            temp=temp.next;
            
            
        }
        
        prev.next=temp.next;
        

        ListNode node=reverse(dummy.next);

        return node;
    }

    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}
