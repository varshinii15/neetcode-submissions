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
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0){
            return null;
        }

        PriorityQueue<Integer> q=new PriorityQueue<>();

        for(ListNode n:lists){
            while(n!=null){
                q.add(n.val);
                n=n.next;
            }
        }

        ListNode fin=new ListNode(q.poll());
        ListNode temp1=fin;

        while(!q.isEmpty()){

            ListNode newNode=new ListNode(q.poll());
            temp1.next=newNode;
            temp1=temp1.next;
        }

        return fin;
    }
}
