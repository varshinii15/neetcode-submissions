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

        int l=0;
        ListNode temp=head;

        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int c=0;

        temp=head;
        while(c<l/2){
            c++;
            temp=temp.next;
        }

        ListNode temp1=reverse(temp.next);
        temp.next=null;
        temp=head;
        while(temp!=null && temp1!=null){

            ListNode next1=temp.next;
            ListNode next2=temp1.next;

            temp.next=temp1;
            temp1.next=next1;

            temp=next1;
            temp1=next2;

        }

        
        

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
