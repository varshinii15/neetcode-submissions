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
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        List<Integer> l = new ArrayList<>();
        int rem = 0;

        while (temp1 != null || temp2 != null || rem != 0) {
            int sum = rem;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            rem = sum / 10;
            l.add(sum % 10);
        }

        

        ListNode res = new ListNode(l.get(0));
        ListNode curr = res;
        for (int i = 1; i < l.size(); i++) {
            curr.next = new ListNode(l.get(i));
            curr = curr.next;
        }

        return res;
    }
}